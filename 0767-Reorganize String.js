/**
 * @param {string} s
 * @return {string}
 */
var reorganizeString = function(s) {
    const n = s.length;

    const frequency = {};
    for (let char of s) {
        if (frequency[char]) {
            frequency[char]++;
        } else {
            frequency[char] = 1;
        }
    }

    let maxChar = '';
    let maxFreq = 0;
    for (let char in frequency) {
        if (frequency[char] > maxFreq) {
            maxFreq = frequency[char];
            maxChar = char;
        }
    }

    if (maxFreq > Math.floor((n + 1) / 2)) {
        return "";  
    }

    const result = new Array(n);

    let index = 0;
    while (frequency[maxChar] > 0) {
        result[index] = maxChar;
        index += 2;  
        frequency[maxChar]--;
    }

    for (let char in frequency) {
        while (frequency[char] > 0) {
            if (index >= n) {
                index = 1;  
            }
            result[index] = char;
            index += 2; 
            frequency[char]--;
        }
    }

    return result.join('');
};

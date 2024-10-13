/**
 * @param {string} s
 * @return {string}
 */
var decodeString = function(s) {
    let stack = [];
    let currentNum = 0;
    let currentStr = '';
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '[') {
            stack.push(currentStr);
            stack.push(currentNum);
            currentStr = '';
            currentNum = 0;
        } else if (s[i] === ']') {
            let num = stack.pop();
            let prevStr = stack.pop();
            currentStr = prevStr + currentStr.repeat(num);
        } else if (isNaN(s[i])) {
            currentStr += s[i];
        } else {
            currentNum = currentNum * 10 + parseInt(s[i]);
        }
    }

    return currentStr;
};

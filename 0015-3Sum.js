/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a, b) => a - b);
    const result = [];
    
    for (let k = 0; k < nums.length - 2; k++) {
        if (k > 0 && nums[k] === nums[k - 1]) continue; 
        
        let i = k + 1;
        let j = nums.length - 1;
        let target = -nums[k];

        while (i < j) {
            let sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                result.push([nums[k], nums[i], nums[j]]);
                i++;
                j--;

                while (i < j && nums[i] === nums[i - 1]) {
                    i++;
                }
                while (i < j && nums[j] === nums[j + 1]) {
                    j--;
                }
            }
        }
    }

    return result;
};

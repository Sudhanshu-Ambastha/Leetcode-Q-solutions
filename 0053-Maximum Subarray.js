/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let maxSum = nums[0];
    let partialSum = 0;
    for(let i = 0; i < nums.length; i++){
        partialSum += nums[i];
        if (partialSum > maxSum) {
            maxSum = partialSum;
        }
        if (partialSum < 0) {
            partialSum = 0;
        }
    }
    return maxSum;
};

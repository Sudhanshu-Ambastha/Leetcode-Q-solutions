/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicate = function(s) {
    let stack = [];
    for(let i = 0; i < s.length; i++){
        if(stack.length > 0 && stack[stack.length - 1] === s[i]){
            stack.pop();
        }
        else{
            stack.push(s[i]);
        }
    }
    return stack.join("");
};
console.log(removeDuplicate("abbaca"));

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
    const res= [];
    let j=0,k=0;
    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i],k++)) {
            res[j++] = arr[i];
        }
    }
    return res;
};
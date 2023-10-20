const num = [5, 2, 9, 1, 5, 6];

num.sort(function(a, b) {
    return b - a;
});

console.log("Sorted array is : ",num);
const counter = function(n) {
    return function() {
        return n++;
    };
};
const myc = counter(10);
// console.log(myc());
// console.log(counter(10)());
console.log(myc(10));
console.log(myc(11));
console.log(myc(12));


//morning ill look inti it
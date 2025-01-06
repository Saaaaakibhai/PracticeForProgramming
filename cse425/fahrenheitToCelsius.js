// fahrenheitToCelsius.ts
function fahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}
var fahrenheitTemp = 100;
var celsiusTemp = fahrenheitToCelsius(fahrenheitTemp);
console.log("".concat(fahrenheitTemp, "\u00B0F is equal to ").concat(celsiusTemp.toFixed(2), "\u00B0C"));

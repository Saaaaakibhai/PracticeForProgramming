// fahrenheitToCelsius.ts

function fahrenheitToCelsius(fahrenheit: number): number {
    return (fahrenheit - 32) * 5 / 9;
}

let fahrenheitTemp: number = 100;
let celsiusTemp: number = fahrenheitToCelsius(fahrenheitTemp);

console.log(`${fahrenheitTemp}°F is equal to ${celsiusTemp.toFixed(2)}°C`);

var array = new Uint32Array(10);
window.crypto.getRandomValues(array);

console.log("Tus numeros de la suerte:");
for (var i = 0; i < 11; i++) {
    console.log(array[i]);
}
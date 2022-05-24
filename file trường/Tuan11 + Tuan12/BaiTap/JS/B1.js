const hex = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];
const btn = document.getElementById("btn");
var sd = document.getElementById("btn");
const color = document.querySelector(".color");
sd.addEventListener("mousemove", () => {
        let hexColor = "#";
        for (let i = 0; i < 6; i++) {
            hexColor += hex[getRand()];
        }

        color.textContent = hexColor;
        document.body.style.backgroundColor = hexColor;
    });

function getRand(){
    return Math.floor(Math.random() * hex.length);
}
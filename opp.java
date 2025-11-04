// JavaScript for changing button color on click
const button = document.getElementById('colorButton');

// Function to change the button's background color
function changeColor() {
    const colors = ['#3498db', '#e74c3c', '#2ecc71', '#f39c12', '#9b59b6'];
    const randomColor = colors[Math.floor(Math.random() * colors.length)];
    button.style.backgroundColor = randomColor;
}

// Event listener for button click
button.addEventListener('click', changeColor);

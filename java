const hearts = ['❤️', '💕', '💖', '💘'];
const flowers = ['🌸', '🌼', '🌷', '🌹'];

function createFloaty(container, symbols, className) {
  setInterval(() => {
    const elem = document.createElement('div');
    elem.className = className;
    elem.innerText = symbols[Math.floor(Math.random() * symbols.length)];
    elem.style.left = Math.random() * 100 + 'vw';
    elem.style.top = '100vh';
    elem.style.fontSize = (Math.random() * 20 + 20) + 'px';
    container.appendChild(elem);
    
    setTimeout(() => elem.remove(), 6000);
  }, 500);
}

createFloaty(document.querySelector('.hearts'), hearts, 'heart');
createFloaty(document.querySelector('.flowers'), flowers, 'flower');

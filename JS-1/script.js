var counter = parseInt(document.getElementById('counter').innerText);

document.getElementById('plus').addEventListener('click',increase);
document.getElementById('minus').addEventListener('click',decrease);

function increase(){
    counter = counter + 1;
    document.getElementById('counter').innerText = counter;
}

function decrease(){
    counter = counter - 1;
    document.getElementById('counter').innerText = counter;
}
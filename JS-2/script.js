document.getElementById('addBtn').addEventListener('click', function () {
    performOperation('add');
  });
  
  document.getElementById('subtractBtn').addEventListener('click', function () {
    performOperation('subtract');
  });
  
  document.getElementById('multiplyBtn').addEventListener('click', function () {
    performOperation('multiply');
  });
  
  document.getElementById('divideBtn').addEventListener('click', function () {
    performOperation('divide');
  });
  
  function performOperation(operation) {
    var num1 = parseFloat(document.getElementById('number1').value);
    var num2 = parseFloat(document.getElementById('number2').value);
  
    if (isNaN(num1) || isNaN(num2)) {
      alert('Please enter valid numbers.');
      return;
    }
  
    var result;
    switch (operation) {
      case 'add':
        result = num1 + num2;
        break;
      case 'subtract':
        result = num1 - num2;
        break;
      case 'multiply':
        result = num1 * num2;
        break;
      case 'divide':
        if (num2 !== 0) {
          result = num1 / num2;
        } else {
          alert('Cannot divide by zero.');
          return;
        }
        break;
      default:
        alert('Invalid operation.');
        return;
    }
  
    alert('Result: ' + result);
  }
  
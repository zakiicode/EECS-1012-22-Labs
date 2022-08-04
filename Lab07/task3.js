// JavaScript code for Task 3
// Learning Objective 1: use of a sub-algorithm with one parameter
// Learning Objective 2: use of a for loop

function addSum(num) {
  var p = document.getElementById("mydata");

  //TODO 1: complete the following line by calling a sub-algorithm to calculate sum of 1 to num
  p.innerHTML = "Result = "+mySum(num); 
}

// a sub-algorithm to return sum of natural numbers up to upTo
// pre-conditions: upTo belongs to Natural numbers >= 0
// post-conditions: returns sum of all natural numbers less than or equal to upTo
function mySum(upTo) {
  
  /*TODO 2: implement the body of the function here to 
  calculate sum of 1 to upTo */
  var sum=0;
  for(i=upTo; i>=0; i--){
    sum=sum+i;
  }
  return sum;
}


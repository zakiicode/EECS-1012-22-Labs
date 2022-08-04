// JavaScript code for Task 2
// Learning Objective 1: use of a sub-algorithm with one parameter
// Learning Objective 2: use of Math.random() and Math.floor()

function passNum(num) {
  var p = document.getElementById("mydata");

  //call a sub-algorithm to return a random whole number in range [1,num]
  var result = generateNum(num);

  /* TODO 1: changes the content of paragraph p accordingly*/
  if(num==10){
    p.innerHTML="A number between 1 and 10 is "+result;
  }
  else if(num==20){
    p.innerHTML="A number between 1 and 20 is "+result;
  }
  else if(num==30){
    p.innerHTML="A number between 1 and 30 is "+result;
  }
  else if(num==40){
    p.innerHTML="A number between 1 and 40 is "+result;
  }
}

// a sub-algorithm to return a random number
// pre-conditions: upTo belongs to Natural numbers > 0
// post-conditions: returns a random whole number in range [1, upTo]
function generateNum(upTo) {

  /*TODO 2: implement the body of the function here to return a random number between 1 and upTo*/
  var x =Math.floor(Math.random() * upTo);
  if (x==0){
    x++;
  }
  return x;

}

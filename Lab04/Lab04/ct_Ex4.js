// in Ex2 to Ex8, change the name of the following function properly
// also update pre/post condition accordingly.
function equation() {
    //precondition: 
    //	num1 represents a Real number. num2 represents a Real number, num3 represents a real number
    //Postcondition:
    //	a statement of how many roots there are has been outputted                                
 
    var a = parseInt(document.getElementById("num1").value);
    var b = parseInt(document.getElementById("num2").value);
    var c = parseInt(document.getElementById("num3").value);
    var y = (Math.pow(b, 2) - (4 * a * c));

      if (y>0){
       document.getElementById("output").innerHTML = "it has 2 distinct roots";
      }
      else if (y<0){
         document.getElementById("output").innerHTML = "it has no roots in real numbers";
      }
      else{
         document.getElementById("output").innerHTML = "it's roots are identical";
      }
 
   
 }
 
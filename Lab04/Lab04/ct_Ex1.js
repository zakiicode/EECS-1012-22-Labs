// in Ex2 to Ex8, change the name of the following function properly
// also update pre/post condition accordingly.
function add() {
    //precondition: 
    //	num1 represents a Real number. num2 represents a Real number
    //Postcondition:
    //	The sum of num1 and num2 has been outputted                                
 

    var w = parseInt(document.getElementById("num1").value);
    var h = parseInt(document.getElementById("num2").value);
   
    var s = w + h;
    document.getElementById("output").innerHTML = "sum: " + s;
 
 }
 
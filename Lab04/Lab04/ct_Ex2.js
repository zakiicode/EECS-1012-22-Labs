// in Ex2 to Ex8, change the name of the following function properly
// also update pre/post condition accordingly.
function area() {
    //precondition: 
    //	num1 represents a Real number. num2 represents a Real number, num3 represents a real number
    //Postcondition:
    //	The area using all sides has been outputted                                
    var a = parseInt(document.getElementById("num1").value);
    var b = parseInt(document.getElementById("num2").value);
    var c = parseInt(document.getElementById("num3").value);


    var d = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    var x = d.toFixed(2);
    document.getElementById("output").innerHTML = "area: " + x;
 
 }
 
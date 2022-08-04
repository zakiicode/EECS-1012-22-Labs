// in Ex2 to Ex8, change the name of the following function properly
// also update pre/post condition accordingly.
function equation() {
    //precondition: 
    //	num1 represents a Real number. num2 represents a Real number, num3 represents a real number
    //Postcondition:
    //	The one or both roots has been outputted                                

    var a = parseInt(document.getElementById("num1").value);
    var b = parseInt(document.getElementById("num2").value);
    var c = parseInt(document.getElementById("num3").value);
    var x = (-1*b);
    var y = Math.sqrt(b*b-4*a*c);
    var z = (2*a);

    var w1 = ((x+y)/z).toFixed(2);
    var w2 = ((x-y)/z).toFixed(2);
    
    document.getElementById("output").innerHTML = "one root:" + w1 +"<br/>another: " + w2;


 
 }
 
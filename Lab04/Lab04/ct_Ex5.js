// in Ex2 to Ex8, change the name of the following function properly
// also update pre/post condition accordingly.
function equation() {
    //precondition: 
    //	num1 represents a Real number
    //Postcondition:
    //	a statement of what letter grade is outputted                                
    var a = parseInt(document.getElementById("num1").value);
    /* in Ex5, you should delete from Line 15 to this line */
    switch (true){
     case (a>89): 
        answer="A+";
        break;
     case (a>79): 
        answer="A";
        break;
        // in Ex5, you need to add more cases for other letter grades
    case (a>74): 
        answer="B+";
        break;
    case (a>69): 
        answer="B";
        break;
    case (a>64): 
        answer="C+";
        break;
    case (a>59): 
        answer="C";
        break;
    case (a>54): 
        answer="D+";
        break;
    case (a>49): 
        answer="D";
        break;
    case (a>39): 
        answer="E";
        break;
     default:
        answer="F";
    }
    
    document.getElementById("output").innerHTML = answer;
 }


 function problem06(){

    var a =parseInt(document.getElementById("num1").value);
    var outputObj=document.getElementById("output");

    if(a>0){
        outputObj.innerHTML = "positive";
    }
    else if(a<0){
        outputObj.innerHTML = "negative";
    }
    else{
        outputObj.innerHTML= "program ended";
        document.getElementById("num1").setAttribute("disabled","true");
        document.getElementsByTagName("button")[0].setAttribute("disabled","true");
    }
 }
 function problem07(){

    var a =parseInt(document.getElementById("num1").value);
    var outputObj=document.getElementById("output");

    if(a>0){
        outputObj.innerHTML = "positive";
        var cnt = parseInt(document.getElementById("positives_counter").innerHTML);
        cnt++;
        document.getElementById("positives_counter").innerHTML =cnt;
    }
    else if(a<0){
        outputObj.innerHTML = "negative";
        var cnt = parseInt(document.getElementById("negitives_counter").innerHTML);
        cnt++;
        document.getElementById("negitives_counter").innerHTML =cnt;
    }
    else{
        outputObj.innerHTML= "program ended";
        document.getElementById("num1").setAttribute("disabled","true");
        document.getElementsByTagName("button")[0].setAttribute("disabled","true");
        document.getElementById("ex_7").style.display="inline";
    }
 }
 
 function problem08(){

    var a =parseInt(document.getElementById("num1").value);
    var outputObj=document.getElementById("output");

    if((a % 2)==0 && (a%3)==0){
        outputObj.innerHTML = "it's divisible by 6";
        var cnt = parseInt(document.getElementById("divBy6").innerHTML);
        cnt++;
        document.getElementById("divBy6").innerHTML =cnt;
    }
    else{
        outputObj.innerHTML = "not divisble by 6";
    }
    if(a==0){
        outputObj.innerHTML= "program ended";
        document.getElementById("num1").setAttribute("disabled","true");
        document.getElementsByTagName("button")[0].setAttribute("disabled","true");
        document.getElementById("ex_8").style.display="inline";

    }
 }
// in Ex9 to Ex15, change the name of the following function properly
function fibonacci() {
  
    /* this statement defines an object reference to the 
       html element that its ID is "output".
       Every time you want to output something, use outputObj */
    var outputObj=document.getElementById("output");
  
    // this statement receives some data and parses it to integer
    var a = parseInt(prompt("Please enter a number: ", ""));
    var fir=0;
    var sec=1;
    var sum=0;
    var dig=[];
    /* this statement add some message to our output Object
       you would need to change the message to be appropriate in Ex10 to E15*/ 
       outputObj.innerHTML="number: "+a+"<br><br> Fibonacci: ";
    // translate rest of your flowcharts to js here:
    dig.push(fir);
    dig.push(sec);
   for(var i=2; i<a;i++){
    sum=fir+sec;
    fir=sec;
    sec=sum;
    dig.push(sum)
    //console.log(b);
   }

  
   outputObj.innerHTML=outputObj.innerHTML+dig;
    //the following statements inform the user that the program ended
    //and disable the button (the comment was added on Oct 2021)
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
    document.getElementsByTagName("button")[0].setAttribute("disabled","true");
  }
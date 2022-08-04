// in Ex9 to Ex15, change the name of the following function properly
function problem_09() {
  
    /* this statement defines an object reference to the 
       html element that its ID is "output".
       Every time you want to output something, use outputObj */
    var outputObj=document.getElementById("output");
  
    // this statement receives some data and parses it to integer
    var a = parseInt(prompt("Please enter a number: ", ""));
    var dig= [];
    var temp=a;
    /* this statement add some message to our output Object
       you would need to change the message to be appropriate in Ex10 to E15*/  
       outputObj.innerHTML="number: "+a+"<br><br>its digits: ";

    // translate rest of your flowcharts to js here:
   
   while(temp>0){
      dig.push(temp%10);
      //outputObj.innerHTML=a;
      var temp=Math.floor(temp/10)
   }
  
   outputObj.innerHTML = outputObj.innerHTML+dig;

   var x =10;
   if(true){
      let y=30;
      var z =20;
   }
   console.log(z);
 
    //the following statements inform the user that the program ended
    //and disable the button (the comment was added on Oct 2021)
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
    //document.getElementsByTagName("button")[0].setAttribute("disabled","true");
  }

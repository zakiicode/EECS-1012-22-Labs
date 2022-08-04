// in Ex9 to Ex15, change the name of the following function properly
function problem_10() {
  
    /* this statement defines an object reference to the 
       html element that its ID is "output".
       Every time you want to output something, use outputObj */
    var outputObj=document.getElementById("output");
  
    // this statement receives some data and parses it to integer
    var a = parseInt(prompt("Please enter a number: ", ""));
    var temp=a;
    var counter =0;
    /* this statement add some message to our output Object
       you would need to change the message to be appropriate in Ex10 to E15*/ 
       outputObj.innerHTML="number: "+a+"<br><br>number of 7s: ";
 
    // translate rest of your flowcharts to js here:
   
   while(temp>0){
      if(temp%10==7){
        counter++;
      }
      var temp=Math.floor(temp/10)

   }
   
   outputObj.innerHTML=outputObj.innerHTML+counter;
    
    
    
    
    //the following statements inform the user that the program ended
    //and disable the button (the comment was added on Oct 2021)
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
    document.getElementsByTagName("button")[0].setAttribute("disabled","true");
  }
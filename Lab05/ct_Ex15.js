// in Ex9 to Ex15, change the name of the following function properly
function triangle() {
    /* this statement defines an object reference to the 
       html element that its ID is "output".
       Every time you want to output something, use outputObj */
    var outputObj=document.getElementById("output");
    outputObj.style.textAlign="left";
    outputObj.style.fontSize="11px";
    // this statement receives some data and parses it to integer
    var a = parseInt(prompt("Please enter a number: "));

    var tri=[];
    /* this statement add some message to our output Object
       you would need to change the message to be appropriate in Ex10 to E15*/ 
       outputObj.innerHTML="number: "+a+"<br><br>";
    // translate rest of your flowcharts to js here:

   for(var x=0; x<=a;x++){
      for(var y=0;y<x;y++){
          tri.push("xx")
          //console.log(tri);
      }
      //outputObj.innerHTML=outputObj.innerHTML+"<br>";
      tri.push("<br>")
   }
   outputObj.innerHTML=outputObj.innerHTML+tri.join('');
  var summ=0;
  for(var i=0; i<20;i=i+6){
     summ++;
  }
console.log(summ); 
    //the following statements inform the user that the program ended
    //and disable the button (the comment was added on Oct 2021)
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
    document.getElementsByTagName("button")[0].setAttribute("disabled","true");
  }
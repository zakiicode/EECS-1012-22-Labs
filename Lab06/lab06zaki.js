function ex1() {
  
    var outputObj=document.getElementById("output");
  
    var num = parseInt(prompt("Please enter a number: ", ""));
    var prime = true;
    var d = 2;
      outputObj.innerHTML="number: "+num+"<br><br>prime?: ";
 
    while(prime == true && d<=num/2){
      if((num%d) == 0){
        prime = false;
      }
      d=d+1;
    }
    if(prime == true){
      outputObj.innerHTML=outputObj.innerHTML+num+" is prime";
    }
    else{
      outputObj.innerHTML=outputObj.innerHTML+"is not prime";

    }
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
  }
  function ex2() {
  
    var outputObj=document.getElementById("output");
    outputObj.innerHTML="number: "+num+"<br><br>equal sum?: ";

    var sum1=0;
    var sum2=0;
    for(var i=1; i<=4;i++){
      var num = parseInt(prompt("Please enter a number: ", ""));
      sum1=sum1+num;
  }
  for(var i=1; i<=4;i++){
    var num = parseInt(prompt("Please enter a number: ", ""));
    sum2=sum2+num;
}    
 if(sum1 == sum2){
  outputObj.innerHTML=outputObj.innerHTML+"yes";
 }
 else{
  outputObj.innerHTML=outputObj.innerHTML+"no";
 }
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
  }
  function ex3() {
  
    var outputObj=document.getElementById("output");
    var p=0;
    var n=0;
    do{
      var num = parseInt(prompt("Please enter a number: ", ""));
      if(num>0){
        p=p+1;
      }
      else if(num<0){
        n=n+1;
      }
    }
    while(num!=0 && p<=(2*n));
 
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
  }
  function ex4() {
  
    var outputObj=document.getElementById("output");
    var cnt1=0;
    var cnt2=0;
    for(var i=1; i<=4;i++){
      var num = parseInt(prompt("Please enter a number: ", ""));
      if(num<0){
        cnt1=cnt1+1;
      }
    }
    for(var i=1; i<=4;i++){
      var num = parseInt(prompt("Please enter a number: ", ""));
      if(num>0){
        cnt2=cnt2+1;
      }
    }    
        outputObj.innerHTML="number: "+num+"<br><br>equal amount of + and -?: ";
 
        if(cnt1 == cnt2){
          outputObj.innerHTML=outputObj.innerHTML+"yes";
         }
         else{
          outputObj.innerHTML=outputObj.innerHTML+"no";
         }
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
  }
  function ex5() {
  
    var outputObj=document.getElementById("output");
  
    var num = parseInt(prompt("Please enter a number: ", ""));

        outputObj.innerHTML="number: "+num+"<br><br>prime numbers: ";
 
    for(var i=2; i<=num; i++){
      if(prime(i) == true){
        outputObj.innerHTML=outputObj.innerHTML+i+" ";
      }
    }
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
  }
  function prime(num){
    var flag = true;
    var d =2;
    while(flag == true && d<=(num/2)){
      if((num%d)==0){
        flag=false;
      }
      d=d+1;
    }
    return flag;
  }
  function ex6() {
  
    var outputObj=document.getElementById("output");
  
    var num = parseInt(prompt("Please enter a number: ", ""));

        outputObj.innerHTML="number: "+num+"<br><br>prime numbers with a digit of 7: ";
 
    for(var i=2; i<=num; i++){
      if(prime(i) == true && has7(i) == true){
        outputObj.innerHTML=outputObj.innerHTML+i+" ";
      }
    }
    outputObj.innerHTML=outputObj.innerHTML+"<br><br>"+"program ended";
  }
  function has7(num){
    var seven =false;
    while(num>0){
      if((num%10) == 7){
        seven = true;
        console.log(29);
        break;
      }
      num = Math.floor(num/10);
    }
    return seven;
  }

  
function prog1Zaki() {
  
   
    var outputObj=document.getElementById("output");
    var a = parseInt(prompt("Please enter a number: "));
    var b = parseInt(prompt("Please enter a number: "));
    var c = parseInt(prompt("Please enter a number: "));
    
    outputObj.innerHTML="Number of roots: ";

    var d= b*b - (4*a*c);
    if(d>0){
        outputObj.innerHTML=outputObj.innerHTML+"2 distinct roots";
    }
    else if(d<0){
        outputObj.innerHTML=outputObj.innerHTML+"no roots in ℝ";
    }
    else{
        outputObj.innerHTML=outputObj.innerHTML+"identical roots";
    }


  }
  function prog3Zaki() {
  
   
    var outputObj=document.getElementById("output");
    var a = parseInt(prompt("Please enter a number: "));
    var b = parseInt(prompt("Please enter a number: "));
    var c = parseInt(prompt("Please enter a number: "));
    var d = parseInt(prompt("Please enter a number: "));

    
    outputObj.innerHTML="Is a number equal to product of the other 3: ";
    if(a==(b+c+d)){
        outputObj.innerHTML=outputObj.innerHTML+"YES";
    }
    else if(b==(a+c+d)){
        outputObj.innerHTML=outputObj.innerHTML+"YES";
    }
    else if(c==(a+b+d)){
        outputObj.innerHTML=outputObj.innerHTML+"YES";
    }
    else if(d==(a+b+c)){
        outputObj.innerHTML=outputObj.innerHTML+"YES";
    }
    else{
        outputObj.innerHTML=outputObj.innerHTML+"NO";

    }
  }
  function prog2Zaki() {
  
   
    var outputObj=document.getElementById("output");
    var num = parseInt(prompt("Please enter a number: "));
    outputObj.innerHTML="Self diving? ";
    var flag = true;
    var d=0;
    while(num!=0 && flag){
        d= num%10;
        if(d==0){
            flag=false;
        }
        else if((num%d)!=0){
            flag=false;
        }
        else{
            num= Math.floor(num/10);
        }
    }
    if(flag){
        outputObj.innerHTML=outputObj.innerHTML+"self Dividing";
    }
    else{
        outputObj.innerHTML=outputObj.innerHTML+"not self-dividing";
    }
       

    
  }

  function prog4Zaki() {
  
   
    var outputObj=document.getElementById("output");
    var sum =0;
    var dig=[];
    for(var i=1;i<100;i++){
        var a = parseInt(prompt("Please enter a number: "));
        dig.push(a);
    }

    for(var i=0;i<100;i++){
        sum = sum+ dig[i];
    }
    
    outputObj.innerHTML="sum of 100 numbers in array: "+sum;
    
  }

  function prog5Zaki() {
  
   
    var outputObj=document.getElementById("output");
    var sum =0;
    var dig=[[[1,2],
            [3,4]],
            [[5,6],
            [7,8]]];
    for(var i=0;i<dig.length;i++){
        for(var j=0;j<dig[i].length;j++){
            for(var w=0;w<dig[j].length;w++){
            sum=sum+dig[i][j][w];
            }
        }
    }
    
    outputObj.innerHTML="sum of numbers in array: "+sum;
    
  }
  function prog6Zaki() {
  
   
    var outputObj=document.getElementById("output");
    var product =1;
    var dig=[[[1,2],
            [3,4]],
            [[5,6],
            [7,8]]];
    for(var i=0;i<dig.length;i++){
        for(var j=0;j<dig[i].length;j++){
            for(var w=0;w<dig[j].length;w++){
             product=product*dig[i][j][w];
            }
        }
    }
    
    outputObj.innerHTML="product of numbers in array: "+product;
    
  }

  function prog7Zaki() {

    var outputObj=document.getElementById("output");
    var A=[[12,-3,2,14],
            [11,-2,-8,4],
            [3,0,0,-5]];
            //console.log(A);
    var P= [[],[],[]];

    for(var i=0;i<A.length;i++){
        for(var j=0;j<A[i].length;j++){
            //console.log(A[i][j]);
            if((prime(A[i][j]) == true)){
                P[i][j] = true;
            }
            else {
                P[i][j] = false;
            }
        }
    }
    //console.log(A.toString());
    outputObj.innerHTML=P;
    
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
    if(num<1){
        flag = false;
    }
    return flag;
  }

  function prog8Zaki() {

    var outputObj=document.getElementById("output");
    var A=[ [12,-3,2,15],
            [11,-2,-8,3],
            [3,0,0,5],
            [11,-8,7,6]];
            //console.log(A);
    var num1 = 0;
    var num2 =0;
    for(var i=0;i<A.length;i++){
        for(var j=0;j<A.length;j++){
            if(i==0 && i!=j){
            num1=A[i][j];
            num2=A[j][i];
            A[i][j]=num2;
            A[j][i]=num1;
            }else if(i==1 && i!=j && j>=1){
                num1=A[i][j];
                num2=A[j][i];
                A[i][j]=num2;
                A[j][i]=num1;
                }
            else if(i==2 && i!=j && j>=2){
                num1=A[i][j];
                num2=A[j][i];
                A[i][j]=num2;
                A[j][i]=num1;
                }
        }
    }
    //console.log(A.toString());
    outputObj.innerHTML=A;
    
  }
  function prog9Zaki() {

    var outputObj=document.getElementById("output");
    var A=[ [12,-3,2,14],
            [11,-2,-8,4],
            [3,0,0,-5]];
            //console.log(A);
    var Z=[[],[],[]];
    for(var i=0;i<A.length;i++){
        for(var j=0;j<A[0].length;j++){
            if((A[i][j])==0){
                for(var x=0;x<A.length;x++){
                    Z[x][j]=0;
                
                for(var y=0;y<A[0].length;y++){
                    console.log(y);
                    Z[i][y]=0;
                }
            }
            }
            else{
                Z[i][j] = A[i][j];
            }

    }
}
    outputObj.innerHTML=Z;
    
  
}

function prog10Zaki() {

    var outputObj=document.getElementById("output");
    var A=[ [1,1,0,1,1,0],
            [0,0,1,1,0,1],
            [1,1,0,1,1,0],
            [1,0,1,1,0,0]];

    var W = [[],[],[],[]];
    for(var i=0;i<A.length;i++){
        for(var j=0;j<A[0].length;j++){
        if(A[i][j]==0){
            if(i==0 && j==0){
                if(A[i+1][j]==1 && A[i][j+1]==1){
                   W[i][j] = "wow";
                   }
                   else{
                    W[i][j]=A[i][j];
                }
               }
            else if(i==0 && j>0 && j<A[0].length-1){
                if(A[i+1][j]==1 && A[i][j+1]==1 && A[i][j-1]==1){
                   W[i][j] = "wow";
                   }
                   else{
                    W[i][j]=A[i][j];
                }
               }
            else if(i==0 && j==A[0].length-1){
                if(A[i+1][j]==1 && A[i][j-1]==1){
                    W[i][j] = "wow";
                    }else{
                        W[i][j]=A[i][j];
                    }
            }
            else if(i>0 && j<=0){
            if(A[i+1][j]==1 && A[i-1][j]==1 && A[i][j+1]==1){
               W[i][j] = "wow";
               }else{
                W[i][j]=A[i][j];
            }
            }
            else if(i>=A.length-1 && j>0){
                if(A[i-1][j]==1 && A[i][j+1]==1 && A[i][j-1]==1){
                   W[i][j] = "wow";
                   }
                   else{
                    W[i][j]=A[i][j];
                }
               }
            else if(i>0 && j>=A[0].length-1){
                if(A[i+1][j]==1 && A[i-1][j]==1 && A[i][j-1]==1){
                   W[i][j] = "wow";
                   }
                   else{
                    W[i][j]=A[i][j];
                }
            }
            else if(i>A.length && j>=A[0].length){
                if(A[i-1][j]==1 && A[i][j-1]==1){
                   W[i][j] = "wow";
                   }
                   else{
                    W[i][j]=A[i][j];
                }
            }
            else if(i>0 && j>0){
                if(A[i+1][j]==1 && A[i-1][j]==1 &&A[i][j+1]==1 && A[i][j-1]==1){
                   W[i][j] = "wow";
                   }
                   else{
                    W[i][j]=A[i][j];
                }
               }
            else{
                W[i][j]=A[i][j];
            }
        }
        else{
            W[i][j]=A[i][j];
        }
        }
    }
    //console.log(A.toString());
    outputObj.innerHTML=W;
  }

  function prog11Zaki() {

    var outputObj=document.getElementById("output");
    var A=[1,2,2,6,99,99,7];
    var count=0;
    var sum=0;
            //console.log(A);
    for(var i=0;i<A.length;i++){
        if(A[i]==6){
            count =1;
        }
        else if(A[i]==7){
            count=0;
        }
        else if(count==0){
            sum=sum+A[i];
        }
}
    outputObj.innerHTML=sum;
    
  
}
function prog12Zaki() {

    var outputObj=document.getElementById("output");
    var A=[1,4,6,8,3,9,13,0,45,-2];
            //console.log(A);
    var B= [];

    for(var i=0;i<A.length;i++){
        for(var j=0;j<A[i].length;j++){
            //console.log(A[i][j]);
            if((prime(A[i][j]) == true)){
                B[i][j] = true;
            }
            else {
                B[i][j] = false;
            }
        }
    }
    //console.log(A.toString());
    outputObj.innerHTML=P;
    
  }
  function prog13Zaki() {

    var outputObj=document.getElementById("output");
    var A=[[12,-3,2,14],
            [11,-2,-8,4],
            [3,0,0,-5]];
            //console.log(A);
    var P= [];
    var x=0;
    for(var i=0;i<A[0].length;i++){
        for(var j=0;j<A.length;j++){
            P[x]=A[j][i];
            x++;
        }
    }
    //console.log(A.toString());
    outputObj.innerHTML=P;
    
  }

  function prog14Zaki() {

    var outputObj=document.getElementById("output");
    var A=[[12,-3,2,14],
            [11,-2,-8,4],
            [3,0,0,-5]];
            //console.log(A);
    var P= [[],[],[],[]];
    for(var i=0;i<A[0].length;i++){
        for(var j=0;j<A.length;j++){
            P[i][j]=A[j][i];
        }
    }

    var ed ="WHITE";
    var de ="white";
    var deed= ed+de;
    alert(deed);
    //console.log(A.toString());
    outputObj.innerHTML=P;
    
  }

  function f(n) {
  

   var x=0;
    var outputObj=document.getElementById("output");
   // outputObj.innerHTML="Se";
    if(n == 0){
        x=1;
    }
    else if(n == 1){
        x=1;
    }
    else if(n == 2){
        x=1;
    }
    else if(n >2){
         x = f(n-3)* f(n-2) - f(n-1);
    }
    
    return x;

    
  }
  function smq5(){
      nm =6;
      nc = 10;
      nn =9;
    return nm;
  }
function smq2(){
    var x = [2,3,5,6,1,2];
    alert(x["ones"]);
}
  function recursionBA(num){
      if(num<10){
          output+="10";
      }
      else{
          output+=(num*2);
          recursionBA(num/2);
      }
      alert(output);
  }

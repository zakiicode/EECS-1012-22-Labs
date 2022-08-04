function p01Func() {
	
    ar = document.getElementById("problem").innerHTML="<p>I'm looking for a type of pancake originating from the Indian subcontinent, made from a fermented batter. It is somewhat similar to a crepe in appearance.</p>";

    document.getElementById("flowchart").setAttribute("src","images/dosa/dosaDesign.jpg");

    document.getElementById("flowchart").display="none";
    

       document.getElementById("js").setAttribute("src","images/dosa/dosa1.jpg");
       document.getElementById("js").display="none";
 
       document.getElementById("another").setAttribute("src","images/dosa/dosa2.jpg");
       document.getElementById("another").display="none";
  
       document.getElementById("check1").checked=false;
    document.getElementById("check2").checked=false;
    document.getElementById("check3").checked=false;
  
  }
  
    
  /* in Ex4, create function p02Func similar to p01Func */
  function p02Func() {
	
   ar = document.getElementById("problem").innerHTML="<p>I'm looking for an Iranian dish that consists of grilled chunks of chicken which are sometimes with bone and other times without bone. It's one of the most popular dishes of Iran. It is common to marinate the chunks in minced onion, lemon juice and sometimes saffron.</p>";

   document.getElementById("flowchart").setAttribute("src","images/jujeh/jujehDesign.jpg");

   document.getElementById("flowchart").display="none";
   

      document.getElementById("js").setAttribute("src","images/jujeh/jujeh1.jpg");
      document.getElementById("js").display="none";

      document.getElementById("another").setAttribute("src","images/jujeh/jujeh2.jpg");
      document.getElementById("another").display="none";
 
   document.getElementById("check1").checked=false;
   document.getElementById("check2").checked=false;
   document.getElementById("check3").checked=false;
 
 }
  
  function checkUncheck1(){
    if (document.getElementById("check1").checked==true) {
       document.getElementById("flowchart").style.display="inline";
 
       
    }
    else {
       document.getElementById("flowchart").style.display="none";
 
        
    }
  }
  
  function checkUncheck2(){
    if (document.getElementById("check2").checked==true) {
       document.getElementById("js").style.display="inline";
 
       
    }
    else {
       document.getElementById("js").style.display="none";
 
        
    }
  }
  
  function checkUncheck3(){
    if (document.getElementById("check3").checked==true) {
       document.getElementById("another").style.display="inline";
 
       
    }
    else {
       document.getElementById("another").style.display="none";
 
        
    }
  }
  
  

 

  /* in Ex5, create functions zoomIn() and zoomOut() */
  
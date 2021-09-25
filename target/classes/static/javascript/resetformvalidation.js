/**
 * 
 */


function validateForm() {
    //collect form data in JavaScript variables
    var pw1 = document.getElementById("pswd1").value;
    var pw2 = document.getElementById("pswd2").value;

    if(pw1 == "") {
      document.getElementById("message1").innerHTML = "**Fill the password please!";
      return false;
    }
    if(pw2 == "") {
      document.getElementById("message2").innerHTML = "**Enter the password please!";
      return false;
    } 
    if(pw1.length < 8) {
      document.getElementById("message1").innerHTML = "**Password length must be atleast 8 characters";
      return false;
    }
    if(pw1.length > 15) {
      document.getElementById("message1").innerHTML = "**Password length must not exceed 15 characters";
      return false;
    }
  
    if(pw1 != pw2) {
      document.getElementById("message2").innerHTML = "**Passwords are not same";
      return false;
    } else {
      alert ("Your password created successfully");
      document.write("JavaScript form has been submitted successfully");
    }
 }
/**
 * 
 */

function loginvalidation()
{
var username = document.forms["loginform"]["username"].value;
var password = document.forms["loginform"]["password"].value;

if(username == "" || password == "")
{
	alert("Please enter username or password");
	return false;
}
else if(!isNaN(username))
{
	alert("Username should contains characters only");
	return false;
}
else if(username.length != 10)
{
	alert("The length of username should be 10");
	return false;
}
else if((password.length < 8) && (password.length > 15))
{
	alert("The password length must be atleast 8 characters but not exceeding 16 characters");
	return false;
}
}
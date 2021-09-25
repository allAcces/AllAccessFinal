/**
 * 
 */

function validateShopArea()
{
	var shopname = document.forms["shapareaform"]["shopname"].value;
	var shoparea = document.forms["shapareaform"]["shoparea"].value;
	var shopadd = document.forms["shapareaform"]["shopadd"].value;
	var pincode = document.forms["shapareaform"]["pincode"].value;
	var mobilenumber = document.forms["shapareaform"]["mobilenumber"].value;
	var shopemailmailid = document.forms["shapareaform"]["shopemailmailid"].value;
	var mobilenumberregex = /^\[0-9]{10}$/;
	var pincoderegex = /^\[0-9]{6}$/;
	
	if (shopname == "" || shopname == null) 
	{
			alert("Please enter the shop name");
			return false;
	}
	else if (shoparea == "" || shoparea == null) 
	{
			alert("Please enter the shop area");
			return false;
	}
	else if (shopadd == "" || shopadd == null) 
	{
			alert("Please enter the shop address");
			return false;
	}
	else if (pincode == "" || pincode == null) 
	{
			alert("Please enter the area pincode");
			return false;
	}
	else if (pincode.match(pincoderegex)) 
	{
			alert("Enter valid 6 digits pin code");
			return false;
	}
	else if (mobilenumber == "" || mobilenumber == null) 
	{
			alert("Please enter the contact number");
			return false;
	}
	else if (shopemailmailid == "" || shopemailmailid == null) 
	{
			alert("Please enter the shop email id");
			return false;
	}
	else if(mobilenumber.match(mobilenumberregex))
	{
			alert("Please enter valid 10 digit contact number");
			return false;
	}
}
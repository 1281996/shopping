function validateFirstName() {
	function validateForm()
	{
	    var x=document.forms["form"]["userName"].value;  
	    if(x==null || x=="" ||x.length==10)
	    {
	        alert("username blank");
	        return false;
	    }

	    var y=document.forms["myform"]["password"].value;
	    if(y==null || y=="")
	    {
	        alert("password is mandatory");
	        return false;
	    }
	    else
	    {
	        return true;
	    }

	}
        }
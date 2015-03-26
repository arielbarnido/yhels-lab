<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Expenses</title>

<link type="text/css" rel="stylesheet" href="css/uno.css"/>
<script src="jquery-1.11.2.min.js"></script>
<script type="text/javascript">
	function doEdit(row){
		alert("You are about to edit this row..");

		document.getElementById(row).disabled=false;
	}


	function doDelete(){
		alert("Are you sure you want to delete this row...");
	}

</script>


</head>

<body>



<div id="content">
	<a href="http://localhost:8081/Uno/ExpenseViewServlet">LINK</a>
</div>
</body>
</html>

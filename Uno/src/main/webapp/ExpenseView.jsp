<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Expenses</title>

<link type="text/css" rel="stylesheet" href="css/uno.css"/>
<script src="jquery-1.11.2.min.js"></script>
<script type="text/javascript">

	initTabView();
	function doEdit(row){
		alert(row);

		document.getElementById("sav").disabled=false;
		document.getElementById(row).disabled=false;
		document.getElementById("cat").disabled=false;
		
	}

	function doDelete(){
		alert("Are you sure you want to delete this row...");
		
	}

	function doSave(expId){
		alert(expId);
		document.getElementById('expenseId').value=expId;
		
		
		document.expenseForm.submit();
	}


	



	function initTabView(){

		
		
		var x = document.getElementByClassName('tab-view');

		for(var i=0;i< x.lenght;i++){
			x[i].onclick = displayTab;
		}

		var prevViewedTab = null;

		function displayTab(e){
			var idOfTabToDisplay = this.getAttribute('data-tab');

			if(prevViewedTab){
				prevViewedTab.style.display = 'none';
			}

			var tabToDisplay = document.getElementById(idOfTabToDisplay);
			tabToDisplay.style.display = 'block';
			prevViewedTab = tabToDisplay;
		}

		var defaultTab = document.getElementByClassName('default-tab');
		if(defaultTab.lenght){
			defaultTab[0].style.display = 'block';
			prevViewedTab = defaultTab[0];
		}
		
		
	}

</script>
</head>

<body>

<div id="nav">
	<ul>
		<li><a href="http://localhost:8081/Uno/ExpenseViewServlet">Finance</a></li>
		<li><a href="#">TAB 2</a></li>
		
	</ul>
</div>


<div id="tabCtrl">
<div id="mainDiv">
	<form name="expenseForm" method="get" action="ExpenseViewServlet">
	
	<table id="expView" cellspacing="0">
		<tr>
			<th scope="col">CATEGORY</th>
			<th scope="col">DETAILS</th>
			<th scope="col">AMOUNT</th>
			<th scope="col">DATE</th>
			<th scope="col">OPTIONS</th>
		</tr>
		
		
		<c:forEach var="detail" items="${expenseDetails}">
			<tr>
				<td>
					<select id="cat">
						<c:forEach var="categories" items="${categories}">
							<option value="${categories.key}" ${categories.key == detail.category ? 'selected="selected"' : ''}>${categories.key}</option>
						</c:forEach>
					</select> 
				</td>
				
				<td><input id="${detail.category}${detail.expenseDate}" type="text" value='<c:out value="${detail.details}"/>' disabled="true"/></td>
				<td><c:out value="${detail.amount}"/></td>
				<td><c:out value="${detail.expenseDate}"/></td>
				
				
				
				
				<td>
					<img src="images/edit_icon.jpg" width="20px" height="20px" onclick="doEdit('${detail.category}${detail.expenseDate}')">
					<img src="images/delete_icon.png" width="20px" height="20px" onclick="doDelete()">
					<img id ="sav"${detail.expenseId} src="images/save_icon2.jpg" width="20px" height="20px" onclick="doSave('${detail.expenseId}')">
					
				</td>
			</tr>
			
		</c:forEach>
		<input type="hidden" name="expenseId"></input>
	</table>
	<br>	
	<br>
	
	</form>
	
	
	
</div>
</div>


<script type="text/javascript">
	initTabView();
</script>
</body>
</html>
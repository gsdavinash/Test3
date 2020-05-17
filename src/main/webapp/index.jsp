<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script type="text/javascript" src="jquery/jquery.js"></script>
</head>
<body>
<h2>Hello World!</h2>
<c:url var="u1" value="index2.jsp"></c:url>
<form method="get" action="${u1}">
<label for="gender">Gender</label>
<input type="radio" name="gender" id="displayipv4" label="Male" value="Male"/><span>Male</span>
<input type="radio" name="gender" id="displayipv6" label="Female" value="Female"/><span>Female</span>
<div id="ipv4" style="display:none">
<label for="ipv4Expresion">IPV4 Expression</label>
<input type="text" id="ip4" name="ip4" placeholder="ipv4" />
</div>
<div id="ipv6" style="display:none">
<label for="ipv6Expresion">IPV6 Expression</label>
<input type="text" id="ip6" name="ip6" placeholder="ipv6"/>
</div>
<br><br>
<input type="submit" name="submit" value="Save"/>
<input type="reset" name="reset" value="clear"/>
</form>

<script>
$(document).ready(function(){
	
	$("input:radio[name='gender']").change(function(){
		var a=$(this).val();
		alert("clicked "+a);
		
		if ($("#displayipv4").is(":checked")) {
			
            $("#ipv4").show();
            $("#ip6").val("");
            
        } else {
            $("#ipv4").hide();
            
        }
		if ($("#displayipv6").is(":checked")) {
            $("#ipv6").show();
            $("#ip4").val("");
        } else {
            $("#ipv6").hide();
        }
		
	});
	
	
});
</script>
</body>
</html>

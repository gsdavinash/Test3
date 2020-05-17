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
<label for="IP">IP </label>
<input type="radio" name="IP" id="displayipv4" value="IPV4" onclick="ipchange(ipv4)"/><span>IPV4</span>
<input type="radio" name="IP" id="displayipv6" value="IPV6" onclick="ipchange(ipv6)"/><span>IPV6</span>
<br><br>
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
function ipchange(name)
{

}
</script>
</body>
</html>

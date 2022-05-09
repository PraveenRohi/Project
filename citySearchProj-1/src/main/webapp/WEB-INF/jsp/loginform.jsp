<%@ include file="header.jspf"%>
<%@ include file="navigation.jspf"%>
<fieldset>
<legend style="font-weight:bold;color:blue;bgcolor:grey">Login Form</legend>
<form method="get" action="/login">
<table height="200" >
<tbody>
<tr>
<td>&nbsp;Email Id:<br></td>
<td>&nbsp;<input type="text" name="useremail"></td></tr>
<tr>
<td>&nbsp;Password:</td>
<td>&nbsp;<input type="password" name="userpass"></td></tr>

<tr><td><input type="submit" value="login" name="button1"></td></tr>
</tbody>
</table>
</form>
</fieldset>

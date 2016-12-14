<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Enumeration"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="pragma" content="no-cache"> 
<meta http-equiv="cache-control" content="no-cache"> 
<meta http-equiv="expires" content="0"> 
<title>登录页面</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/js/themes/default/easyui.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/js/themes/icon.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>" />
<script type="text/javascript" src="<c:url value='/js/jquery-1.8.0.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/jquery.easyui.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/public.js'/>"></script>  
<script type="text/javascript">
	$(document).ready(function () {   
        var url = window.parent.document.URL;  
       if (url.indexOf("layout") != -1) {//layout页面才reload  
        window.location.reload("${pageContext.request.contextPath}/main");  
       }  
    });
</script>
</head>
<body>
<span style="color:red">${errormsg}</span>
<form action="<c:url value='/login'/>" method="post">
	<div id="p" class="easyui-panel" title="登录"
	    style="width:600px;height:370px;padding:10px;background:#fafafa;"data-options="iconCls:'icon-save',closable:false">
		<table width="73%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="21%" height="37" align="center"><font size="2"
					style="">用&nbsp;户</font></td>
				<td width="75%"><input type="text" name="username" id="username" size="20" value="${username}"></td>
			</tr>
			<tr>
				<td height="33" align="center"><font size="2" style="">密&nbsp;码</font></td>
				<td width="75%"><input type="password" id="password"
					name="password" size="22"></td>
			</tr>
			<tr>
				<td align="center"></td>
				<td>
				<input name="button" type="submit" class="button" value="登录" />
				</td>
			</tr>
		</table>
	</div>
</form>
</body>
</html>
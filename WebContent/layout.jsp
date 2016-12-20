<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache"> 
	<meta http-equiv="cache-control" content="no-cache"> 
	<meta http-equiv="expires" content="0"> 
	<title>平台管理系统</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/js/themes/bootstrap/easyui.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='/js/themes/icon.css'/>" />
	<style type="text/css">
	
	/*plist页面使用*/
	.peast {width: 30%;}
	.psouth {height: 60%;}
	
	/*addproject页面使用*/
	table.normal {
	    border-collapse: collapse;
	    width: 100%;
	    font-size: 12px
	}
	
	caption.normal {
	    text-align: left;
	    padding: 8px;
	    font-weight:bold
	}
	td.normal:nth-child(odd){text-align: right}
	tr.normal:nth-child(even){background-color: #f2f2f2}

</style>
	</style>
	<script type="text/javascript" src="<c:url value='/js/jquery.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/js/jquery.easyui.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/js/public.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/js/jquery.portal.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/js/locale/easyui-lang-zh_CN.js'/>"></script> 
	<script type="text/javascript" src="<c:url value='/js/json2.js'/>"></script>
	<script type="text/javascript">
	$.ajaxSetup ({cache:false});
	var link = function(node){
		//如果是叶子节点
		if($(this).tree('isLeaf', node.target)){
			//打开页面
			var formurl = "<%=request.getContextPath()%>" + node.attributes.url;
			$('#mainpanel').panel('setTitle' ,node.text).panel('refresh',formurl);
		}
		//折叠/展开功能组菜单
		else  $(this).tree('toggle', node.target);
	};
	</script>
</head>
<body class="easyui-layout" data-options="fit:true">
	<div data-options="region:'north',border:false" style="height:60px;padding:0px;background-image:url('<c:url value="/images/login_13.gif"/>')">
	 上头域增加图 片
	</div>
	<div data-options="region:'west',split:true" title= "菜单" style="width:200px;padding:0px;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
		<c:choose>
			<c:when test="${user.roleId == 'A'}">
				<div title="管理员功能列表"  data-options="selected:true" style="padding:10px;overflow:auto;">
						<ul id="adminmenu" class="easyui-tree" data-options="url:'<c:url value="/menu/admin_menu.json"/>', onClick:link"/>
				</div>
			</c:when>
			<c:when test = "${user.roleId == 'U'}">
				<div title="用户功能列表" data-options="selected:true" style="padding:10px">
					<ul id="usermenu" class="easyui-tree" data-options="url:'<c:url value="/menu/user_menu.json"/>', onClick:link"/>
				</div>
			</c:when>
			<c:otherwise>
				你没有权限访问此页面。
			</c:otherwise>
		</c:choose>
		</div>
	</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">
		右侧隐藏域，暂不考虑
	</div>
	<div data-options="region:'south',border:false" style="height:25px;background:#A9FACD;padding:5px;">
	下边域
	</div>
	<div id="main" data-options="region:'center'" style="padding:0px;">
		<!-- 如果希望嵌入panel或tab -->
		<div id="mainpanel" style="padding:5px;">	
		</div>
	</div>
	<script type="text/javascript">
	 $('#mainpanel').panel({ 
		 title:'欢迎使用应用系统',
		 fit:true,
		 border:false,
		 cache:false,
		 href:'project/main.jsp',
		 collapsible:false
	});
	</script>
</body>
</html>
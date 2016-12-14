<!DOCTYPE html>
<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="#" id="npb" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="mainlink(this, '<c:url value='/project/add'/>');">新建项目</a>
	<div id="mp" style="width:700px;height:500px;">
	    <div style="width:33%"></div>
	    <div style="width:33%"></div>
	    <div style="width:33%"></div>
	</div>
	<div t="template" class="easyui-panel">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false">
				<div class="easyui-layout" fit="true">
					<div region="east" padding="0px" class="peast" border="false">
						<ul>
							<li>负责人图片</li>
							<li>负责人</li>
						</ul>					
					</div>
					<div region="center" padding="0px" border="false">
						<h3><a id="info" href="#" onclick="mainlink(this, '<c:url value='/project/info'/>?id=');">项目名称</a></h3>
						人员：xxx  状态：     当前任务中
					</div>
				</div>
			</div>
			<div region="south" border="false" class="psouth" border="false">
				<h3>项目小图表</h3>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//create the panel
		$(function(){
			$('#mp').portal({
				border:false,
				fit:true
			});
			
			for(var i=0; i<5; i++){
				var p = $('div[t="template"]').clone().appendTo('body');
				p.panel({
					id:"p" + i,
				    height:200,
				    width:180,
				    closable: false
				});
				//add project url
				//p.find("#info").attr("href", function() { return "<c:url value='/project/pinfo.jsp'/>?id=" + p.attr('id') });
				// add the panel to portal
				$('#mp').portal('add', {
				    panel: p,
				    columnIndex: i%3  //列索引
				});
			}
		});
	</script>
</body>
</html>
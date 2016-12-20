<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<div id="addprojectpanel" class="easyui-accordion" data-options="fit:true, border:false, onSelect: validBaseInfo">
		<div title="基本信息" style="padding:0px">
		<form id="ff" method="post">
			<div style="padding:10px">
				<input id="bid" class="easyui-textbox" label="项目编号:" type="text" name="projectbid" data-options="width:300,required:true" />
  				<input id="name" class="easyui-textbox" label="项目名称:" type="text" name="projectname" data-options="width:300,required:true"/>
			</div>
			<div style="padding:10px">
				<input id="basesd" name="basesd" type="text">
				<input id="baseed" name="baseed" type="text">
			</div>
			<div style="padding:10px">
				<input type="text" name="edur" label="预计工期:"  class="easyui-numberbox" value="100" data-options="min:0, width:300">
					<select name="timeunit" id="timeunit">
	                  <option value="Hour">小时</option>
				      <option value="SDay">日历天</option>
				      <option value="WDay" selected>工作日</option>
				      <option value="Week">周</option>
				      <option value="Mouth">月</option>
				      <option value="Quarter">季</option>
				      <option value="Year">年</option>
	                </select>
	             <input type="text" name="esize" label="预计规模:" class="easyui-numberbox" value="100" data-options="min:0, width:300">
					<select name="sizeunit" id="sizeunit">
	                  <option value="PHour">人时</option>
				      <option value="PDay" selected>人天</option>
				      <option value="PMouth">人月</option>
				      <option value="PYear">人年</option>
	                </select>
			</div>
			<div style="padding:10px">
				<input id="pid" name="pid" label="项目经理" class="easyui-combobox" name="pname" data-options="valueField:'pid',
																						 textField:'pname',
																						 url:'<c:url value='/project/user'/>',
																						 width:300,
																						 panelHeight:100,
																						 required:true,
																						 onLoadSuccess:function() {$('#pid').combobox('select','请选择');}">
				<input id="pfile" name="pfile" label="项目类型" class="easyui-combobox" data-options="valueField:'id',
																						 textField:'name',
																						 url:'<c:url value='/project/psimfile'/>',
																						 width:300,
																						 panelHeight:60,
																						 required:true,
																						 onLoadSuccess:function() {$('#pfile').combobox('select','请选择');}"><a href="#">模板预览</a>
			</div>
			<div style="padding:10px">
				<input id="comment" name="comment" label="项目描述" labelPosition="top" class="easyui-textbox" data-options="multiline:true" style="height:150px;width:600px" placeholder="简要说明">
			</div>
			<div style="padding:10px">
				<a href="#" onclick="saveBaseInfo();">保存并下一步</a>
			</div>
		</form>
		</div>
		<div title="初始计划" style="padding:0px">
			<table id="wbstg" class="easyui-treegrid" data-options="fit:true, 
											        			 url:'<c:url value='/project/wbs/0'/>',
											        			 rownumbers: true,
														         idField:'id',
														         treeField:'name',
														         lines: true,
														         onDblClickRow:clickRow,
														         singleSelect: true,
																 toolbar: '#tb',
																 onContextMenu: onContextMenu,
														         onLoadSuccess:function(row, data) {
														         	rooIdIndex = data[0].id;
														         },
														         onLoadError:function(XMLHttpRequest, textStatus, errorThrown){
														         	console.log(XMLHttpRequest);
														         	console.log(textStatus);
														         	console.log(errorThrown);
														         }">
			    <thead>
			        <tr>
			            <th data-options="field:'name',width:200,editor:'text'">任务名称</th>
			            <th data-options="field:'sdate',width:100,editor:'datebox'">计划开始</th>
			            <th data-options="field:'edate',width:100,editor:'datebox'">计划完成</th>
			            <th data-options="field:'pid',width:120,align:'right',
			            				  formatter:function(value,row){
			            				  	return row.pname;
			            				  },
			            				  editor:{
											type:'combobox',
											options:{
												valueField:'pid',
												textField:'pname',
												method:'get',
												url:'<c:url value='/project/user'/>',
												required:true
											}
										}">资源名称</th>
			        </tr>
			    </thead>
			</table>
			<div id="tb" style="height:auto">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="append()" data-options="iconCls:'icon-add',plain:true">增加节点</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="removeIt()" data-options="iconCls:'icon-remove',plain:true">删除节点</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
				<!--a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">提交</a-->
			</div>
			<div id="rmenu" class="easyui-menu" style="width:120px;">
				<div onclick="append()" data-options="iconCls:'icon-add'">增加节点</div>
				<div onclick="removeIt()" data-options="iconCls:'icon-remove'">删除节点</div>
				<!--div class="menu-sep"></div-->
			</div>
			<!--div t="template" class="easyui-panel" fit="true">
				<a href="#" onclick="javascript:$('#addprojectpanel').accordion('select',2);">下一步</a>
				<a href="#">保存并离开</a>
			</div-->
		</div>
		<div title="项目团队" style="padding:0px">
			<div style="float:center">
				<div style="padding:5px;float: left; width: 40%">
					<div  id="ulistout" class="easyui-datalist" title="可选成员" style="float: right; fit:true" data-options="url:'<c:url value='/project/user'/>', 
						method:'get',
						valueField:'pid',
						textField:'pname',
						singleSelect: false,
						onLoadSuccess:function(data) {console.log(data);}">
					</div>
				</div>
				<div style="padding:5px;float: left; width: 15%;">
					<p style="text-align:center; ">
					<a href="#" onclick="checkin();">》》》</a><br><a href="#" onclick="checkout();">《《《</a>
					</p>
				</div>
				<div style="padding:5px;float:left; width: 40%">
					<div id="ulistin" class="easyui-datalist" title="已选成员" style="float: right; fit:true" data-options="url:'<c:url value='/project/puser/0'/>', 
						method:'get',
						valueField:'pid',
						textField:'pname',
						checkbox:true,
						onLoadSuccess:function(data) {console.log(data);}">
					</div>
				</div>
			</div>
			<div style="padding:10px;float:right">
				<label>*请勾选</label>
			</div>
		</div>
	</div>
	<script type="text/javascript">

		$(function($) {
			//初始化开始日期
			$('#basesd').datebox({
				label:"预计开始:",
				required:true,
				width:300,
				formatter:dateFormatter,
				parser:dateParser
			});
			//初始化完成日期
			$('#baseed').datebox({
				label:"预计完成:",
				required:true,
				width:300,
				formatter:dateFormatter,
				parser:dateParser
			});
	  		var opts = $('#basesd').datebox('options');
	  		var opte = $('#baseed').datebox('options');
	        $('#basesd').datebox('setValue', opts.formatter(new Date()));
	        //完成日期默认加30天
			$('#baseed').datebox('setValue', opte.formatter(addDays(new Date().getTime(), 30)));
		});
		//验证是否保存项目基本信息
		var validBaseInfo = function(title, index) {
			if (index != 0 && !isSave) {
				$('#addprojectpanel').accordion('select',0);
				alert("请先保存项目的基本信息！");		
			}
		};
		
		var wbsid;
		var isSave = false;
		//保存项目基本信息
		var saveBaseInfo = function() {
			if ($('#ff').form('validate')) {
				var data = $('#ff').serializeObject();
				console.log(data);
				$.post('<c:url value="/project/saveBase"/>',data, function(r){
				    	if (r.status) {
					        wbsid = r.id;
					        isSave = true;
					        alert("保存成功");
					        $('#wbstg').treegrid('reload');
				    	}
				    	else alert("保存失败：" + r.status);
				    },'json');
			}
		}
		var editIndex = undefined;
		function endEditing(){
			if (editIndex == undefined){return true;}
			var eid = editIndex.id;
			if ($('#wbstg').treegrid('validateRow', eid)){			
				var ed = $('#wbstg').treegrid('getEditor', {index:eid,field:'pid'});//offical document have a mistake.
				var pname = $(ed.target).combobox('getText');
				editIndex.pname = pname;
				$('#wbstg').treegrid('endEdit', editIndex.id);
				editIndex = undefined;
				return true;
			} else {
				alert("请完善信息.");
				return false;
			}
		}
		//双击行记录修改
		function clickRow(index){
			console.log("click row id: " + index.id);
			if (editIndex != index){
				if (endEditing()){
					$('#wbstg').treegrid('select', index.id).treegrid('beginEdit', index.id);
					editIndex = index;
				} else {
					$('#wbstg').treegrid('select', editIndex.id);
				}
			}
		}
		//提交保存修改
		function accept(){
			if (endEditing()){
				var data = $('#wbstg').treegrid('getData');
				//var datan = $('#wbstg').treegrid('acceptChanges').treegrid('getData');
				console.log("now data: " + JSON.stringify(data));
			}
		}
		//显示右键菜单
		function onContextMenu(e,row){
			if (row){
				e.preventDefault();
				$(this).treegrid('select', row.id);
				$('#rmenu').menu('show',{
					left: e.pageX,
					top: e.pageY
				});				
			}
		}
		var rooIdIndex;
 		var idIndex;
		//增加节点操作
		function append() {
			//必须结束上一个节点的编辑
			if (!endEditing()) {
				$('#wbstg').treegrid('select', editIndex.id);
				return;
			}
			idIndex = new Date().getTime() + '' + getRndInt(100, 999);//生成靠谱的唯一ID数
			var d1 = new Date();
			var d2 = new Date();
			d2.setMonth(d2.getMonth()+1);
			var node = $('#wbstg').treegrid('getSelected');
			if (!node) {
				alert("请选择一个任务节点."); 
				return;
			}
			$('#wbstg').treegrid('append',{
				parent: node.id,
				data: [{
					id: Number(idIndex),
					name: 'New Task'+idIndex,
					pid: 0,
					sdate: $.fn.datebox.defaults.formatter(d1),
					edate: $.fn.datebox.defaults.formatter(d2)
				}]
			})
		}
		//删除节点操作
		function removeIt(){
			var node = $('#wbstg').treegrid('getSelected');
			if (node){
				$.messager.confirm('确认','您确认要删除此任务节点吗?',function(r){  
                    if (r){  
                    	$('#wbstg').treegrid('remove', node.id); 
                    }  
                }); 
			}
			else alert("请选择一个任务节点."); 
		}
		
		//左侧人员检出到右侧
		function checkin() {
			var slist = $('#ulistout').datalist('getSelections');
			for (var i = 0; i < slist.length; i++) {
				$('#ulistin').datalist('appendRow',slist[i]);
			}
			
		}
		
		//右侧人员检出到左侧
		function checkout() {
			var slist = $('#ulistin').datalist('getSelections');
			for (var i = 0; i < slist.length; i++) {
				$('#ulistout').datalist('appendRow',slist[i]);
			}
		}
	</script>
</body>
</html>
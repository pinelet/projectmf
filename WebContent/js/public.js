/**
 * 项目公共js方法
 * 
 * @author gongxiaosong
 */

//转化日期格式
function dateFormatter(date){
	var y = date.getFullYear();
	var m = date.getMonth()+1;
	var d = date.getDate();
	return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}

//转化日期格式
function dateParser(s){
	if (!s) return new Date();
	var ss = (s.split('-'));
	var y = parseInt(ss[0],10);
	var m = parseInt(ss[1],10);
	var d = parseInt(ss[2],10);
	if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
		return new Date(y,m-1,d);
	} else {
		return new Date();
	}
}

//转化人员状态
var p_personstatus = function(value, row, index) {
	if (row.status)
		return '正常';
	else
		return '冻结';
};


//+---------------------------------------------------  
//| 求两个时间的天数差 日期格式为 YYYY-MM-dd   
//+---------------------------------------------------  
function daysBetween(DateOne,DateTwo)  
{   
  var OneMonth = DateOne.substring(5,DateOne.lastIndexOf ('-'));  
  var OneDay = DateOne.substring(DateOne.length,DateOne.lastIndexOf ('-')+1);  
  var OneYear = DateOne.substring(0,DateOne.indexOf ('-'));  

  var TwoMonth = DateTwo.substring(5,DateTwo.lastIndexOf ('-'));  
  var TwoDay = DateTwo.substring(DateTwo.length,DateTwo.lastIndexOf ('-')+1);  
  var TwoYear = DateTwo.substring(0,DateTwo.indexOf ('-'));  

  var cha=((Date.parse(OneMonth+'/'+OneDay+'/'+OneYear)- Date.parse(TwoMonth+'/'+TwoDay+'/'+TwoYear))/86400000);   
  return Math.abs(cha);  
} 

//Json化表单数据，需要jquery支持
$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

//计算比较传入时间与目前相差的天数
//如果相差天数小于defaulttime则为报警1，如果相差天数大于defaulttime则为正常0，如果相差天数小于0则为失效2
function compareDate(d1, defaulttime) {
	var now = new Date().getTime();
	try {
		var arr = d1.split("-");
	    var starttime = new Date(arr[0], arr[1]-1, arr[2]).getTime();
	    var day = (starttime - now)/86400000;
	    if (0 < day && day  <= defaulttime) return 1;
	    else if (day <= 0) return 2;
	} catch (e){}
	return 0;
}

//日期增加指定的天数
function addDays(date, days) {
    var result = new Date(date);
    result.setDate(result.getDate() + days);
    return result;
}

//判断主键是否存在
function haveKey (e, fun) {
	if (e.data.key){  
        $.post(e.data.url,{id:e.data.key},fun,'json');  
    }
}

//主页面内跳转
function mainlink(e, url) {
	$('#mainpanel').panel('setTitle' ,e.text).panel('refresh',url);
}

//生成指定范围内的随机整数
function getRndInt(min, max) {
    return Math.floor(Math.random() * (max - min) ) + min;
}
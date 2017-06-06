//屏幕宽度
var windows_width = $(window).width();
var windows_height = $(window).height();
var windows_width_px = $(window).width() + "px"
var windows_height_px = $(window).height() + "px"

function creatFormUI(ds) {
	/*
					 * 直接在页面body添加input_text
					 参数说明：
					title:		输入框的名字
			
					 * */

	for(var i = 0; i < ds.result.formWords.length; i++) {
		if(ds.result.formWords[i].dataType == "2") {
			$("body").input_text({
				title: ds.result.formWords[i].display,
				//						placeholder_text: "请输入请输入",
				unit: ds.result.formWords[i].unit
			})
		} else if(ds.result.formWords[i].dataType == "3") {

			$("body").date_pick({

			})
		} else if(ds.result.formWords[i].dataType == "4") {

			$("body").drop_down({

				title: ds.result.formWords[i].display,
				placeholder_text: "请选择",
				pick_title:"请选择",
				pick_data:["11","22","33","44"]
			})
		}
	}

	$(".input_p").each(function() {
		var windowWidth = $(window).width()
			//输入框长度

		//title长度
		var title_width = $(this).children(".input_title").width()
		var unit_width = $(this).children(".input_text").children(".unit").width()
		var input_width = windowWidth - title_width - unit_width - 100

		console.log($(this).children(".input_text").children("input"))

		$(this).children(".input_text").children("input").css("width", input_width + "px")

	})
	$("button").click(function() {
			if(!checkNumber()) {
				alert("请输入数字")
			}

		})
		//循环下拉框
	$(".drop_down").each(function() {
		var windowsWidth = $(window).width() + "px"
		var windowsHeight = $(window).height() + "px"

		$(this).children(".addselect").css("left", windowsWidth)
		$(this).children(".addselect").css("top", "0px")
		$(this).children(".addselect").css("height", windowsHeight)
		$(this).children(".addselect").children("ul").children(".lc_key").click(function() {
			
			
			var tt= $(this).children(".ub-ac").children("h3").text()
			var ele = $(this).parent("ul").parent(".addselect").parent(".drop_down").children(".drop_down_btn").children(".drop_down_word").children(".drop_down_placeholder")
			ele.css("color","#141414")
			ele.text(tt)
			$(this).parent("ul").parent(".addselect").animate({
				left: windowsWidth,
			}, function() {
				$(this).parent("ul").parent(".addselect").css("display", "none")
				
				
			});
		})

		$(this).children(".drop_down_btn").click(function() {
			$(".addselect").css("display", "block")
			$(this).parent(".drop_down").children(".addselect").animate({
				left: '0px',
			});
		})

	})

}
//

(function($) {
	//封装文字框的input
	input_text_UI();
	date_pick_UI();
	drop_down_UI();
})(jQuery);

//封装带日期选择UI
function date_pick_UI() {
	$.fn.date_pick = function(options) {
		var data = {
			title: "",
		}
		var ds = $.extend(data, options);
		var html = ""
		$(".data_pick").css("top", windows_height - 200 + "px")

	}

}
//封装下拉框
function drop_down_UI() {
	$.fn.drop_down = function(options) {
		var data = {
			title: "",
			attribute: "",
			pick_title:"",
			placeholder_text: "",
			pick_data:[]
		}
		var inputType = ""

		var ds = $.extend(data, options);
		var html = ""
		var attr = ""
		if(data.attribute == ""){
			attr = data.placeholder_text;
		}else{
			attr = data.attribute;
		}
		var html_pick_ele = ""
		for (var i = 0; i < data.pick_data.length; i++) {
			var hh = '<li class="ub lc_key">'+
							'<div class="ub ub-ac key_div">'+
								'<h3>'+data.pick_data[i]+'</h3><em class="ub ub-ac ub-pc iconfont"></em> '+
							'</div>'+
						'</li>'
			
			html_pick_ele = html_pick_ele + hh
			
		}
		html = 	'<div class="drop_down">'+
				'<div class="drop_down_btn">'+
					'<div class="input_title lc_input">'+
					'	土地信息'+
					'</div>'+
					'<div class="input_text lc_input drop_down_word">'+
					'	<span  style="color: #b4b4b4;font-size: 14px;font-family: " 微软雅黑 ";" class="drop_down_placeholder">'+attr+
					'</span>'+
					'	<em class="iconfont reset">&#xe602;</em>'+
					'	<span style="margin-right: 10px;" class="unit">'+
					'</span>'+
					'</div>'+
				'</div>'+
				'<div class="line"></div>'+
				'<div class="ub ub-ver farmList addselect" style="position: fixed;z-index: 10000000;top: 0px;margin-top: 0px;">'+
					'<p style="text-align: center;padding: 10px;background: #CCCCCC;">'+data.pick_title+'</p>'+
					'<ul>'+html_pick_ele+'</ul>'+
				'</div>'+
			'</div>'
		$(html).appendTo(".list")

	}

}

//封装数字。数字跟文字是一样的，只是弹出的建盘不一样
//检查是否为数字
function checkNumber() {
	$(".input_p").each(function() {
		//输入框的value
		var text = $(this).children(".input_text").children("input").val()
			//输入框类型
		var type = $(this).children(".input_text").children("input").attr("type")
		if(type == "number") {

			if(text / text == 1 || text == 0) {

				if(text < 0) {

					$(this).children(".input_text").children("input").css("color", "#AC2925")
					return false

				} else {
					console.log("是数字")
					return true;
				}

			}
		}

	})
}

function input_text_UI() {
	$.fn.input_text = function(options) {
		var data = {
			title: "",
			attribute: "",
			placeholder_text: "",
			unit: "",
			isNumber: true

		}
		var inputType = ""
		if(data.isNumber) {
			inputType = "number"
			data.placeholder_text = "请输入数量"
		} else {
			inputType = "text"
		}
		var ds = $.extend(data, options);
		var html = ""

		html = '<div class="input_p">' +
			'<div class="input_title lc_input">' +
			data.title +
			'</div>' +
			'<div class="input_text lc_input">' +
			'	<input type=' + inputType + ' placeholder=' + data.placeholder_text + ' /><em class="iconfont reset">&#xe608;</em><span style="margin-right: 10px;" class="unit">' + data.unit + '</span>' +
			'</div>' +
			'</div>' +
			'<div class="line"></div>'
		$(html).appendTo(".list")
			//设置重置按钮
		$(".reset").click(function() {
			//
			$(this).prev("input").val("")

		})

	}

}

function isBackState() {
	//title的宽度

	//title的字符长度
	var title_length = $(".input_title").text().length

}

//获取表单列表
// JavaScript Document
$(window.parent.document).find("#main_iframe").load(function(){
	var main = $(window.parent.document).find("#main_iframe");
	var thisheight = $(document).height();
	main.height(thisheight);	
});
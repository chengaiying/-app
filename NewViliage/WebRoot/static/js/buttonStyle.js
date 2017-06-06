// JavaScript Document

function myBtnClick(obj,color,jumpUrl){
	var orgColor=obj.style.backgroundColor;
	setTimeout(function(){
		obj.style.backgroundColor=orgColor;
	},300);
	
	obj.style.backgroundColor=color;
	if(jumpUrl!="")
	{
		if(jumpUrl=='-1'){window.history.back(-1);}
		else{location.href=jumpUrl;} 	
	}
}

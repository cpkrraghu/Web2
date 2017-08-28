function sub(id){
	var form=document.getElementById("empForm");
	if(id=="empBtn"){
		form.action="/RaghuWeb2/employee";
		form.submit();
	}else{
		form.action="/RaghuWeb2/department";
		form.submit();
	}
}
function check_ok(){
//	if(document.reg_frm.mem_uid.value==""){
//	if(document.reg_frm.mem_uid.value.length==0){
	//document생략 가능
	if(reg_frm.mem_uid.value.length==0){
		alert("아이디를 써주세요")
		reg_frm.mem_uid.focus();
		return;
	}
	if(reg_frm.mem_uid.value.length<4){
		alert("아이디는 4글자 이상이어야 합니다.")
		reg_frm.mem_uid.focus();
		return;
	}
	if(reg_frm.mem_pwd.value.length==0){
		alert("패스워드는 반드시 입력해야 합니다.")
		reg_frm.mem_pwd.focus();
		return;
	}
	if(reg_frm.mem_pwd.value != reg_frm.pwd_check.value){
		alert("패스워드가 일치하지 않습니다.")
		reg_frm.pwd_check.focus();
		return;
	}
	if(reg_frm.mem_name.value.length==0){
		alert("이름을 써주세요")
		reg_frm.mem_name.focus();
		return;
	}
	if(reg_frm.mem_email.value.length==0){
		alert("Email 써주세요")
		reg_frm.mem_email.focus();
		return;
	}
	reg_frm.submit();
}
function update_check_ok(){
	if(update_form.mem_pwd.value.length==0){
		alert("패스워드는 반드시 입력해야 합니다.");
		update_form.mem_pwd.focus();
		return;
	}
	if(update_form.mem_pwd.value != update_form.pwd_check.value){
		alert("패스워드가 일치하지 않습니다.")
		update_form.pwd_check.focus();
		return;
	}
	if(update_form.mem_email.value.length==0){
		alert("Email 써주세요")
		update_form.mem_email.focus();
		return;
	}
	update_form.submit();
}
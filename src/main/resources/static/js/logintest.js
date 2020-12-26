function loginScript() {
    var id = $("#userId").val();
    var pw = $("#userPw").val();

    var objData = {
        "userId"    : id,
        "userPw"    : pw
    }

    $.ajax({
		url: "/loginCheck",
		data: objData,
		type: "POST",
		success : function(data) {
			console(data);
		},
		error : function() {
			alert("에러");		
		}
	});
}
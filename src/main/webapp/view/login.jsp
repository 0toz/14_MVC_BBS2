<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function login_go(f){
	f.action= "${pageContext.request.contextPath}/MyController?cmd=login_ok"
	f.submit();
}
</script>
</head>
<body>

	<form method="post">
		<fieldset>
			<legend>로그인</legend>
			<p>아이디 : <input type="text" name="id" placeholder="id입력" required>
			<p>패스워드 : <input type="password" name="pwd" placeholder="password 입력" required>
			<input type="button" value="로그인" onclick ="login_go(this.form)">
			
		</fieldset>
	</form>
</body>
</html>
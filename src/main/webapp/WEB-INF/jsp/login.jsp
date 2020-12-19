<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="common/loginHeader.jsp"%>

<body>
<div class="login-form">
    <form action="/examples/actions/confirmation.php" method="post">
        <h2 class="text-center">Log in</h2>       
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Id" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="Password" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Log in</button>
        </div>
        <div class="clearfix">
            <label class="float-left form-check-label"><a href="/signUp">회원가입</a></label>
            <a href="#" class="float-right">비밀번호 찾기</a>
        </div>        
    </form>

    <h2>Hello! ${name}</h2>
    <c:forEach var="list" items="${list}" varStatus="idx">
      ${idx.index}, ${list} <br />
    </c:forEach>
</div>

</body>
</html>
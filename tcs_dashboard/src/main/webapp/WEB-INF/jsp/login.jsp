<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><spring:message code='login.title'/></h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" name="frm" action="<c:url value='/j_spring_security_check'/>" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="<spring:message code='login.id' />" name="j_username" type="email" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="<spring:message code='login.password' />" name="j_password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me"> <spring:message code="login.checkbox" />
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <a href="javascript:document.frm.submit();" class="btn btn-lg btn-success btn-block"><spring:message code="login.submit"/></a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

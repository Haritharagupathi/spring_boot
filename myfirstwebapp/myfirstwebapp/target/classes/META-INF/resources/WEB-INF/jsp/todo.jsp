<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Add Todos Page</title>
</head>
<body>
<%@ include file="common/navigation.jspf" %>

    <div class="container mt-5">
        <h1 class="mb-4">Enter Todo Details</h1>
        <!-- Form for adding Todo -->
        <form:form method="post" modelAttribute="todo">
            <!-- Description Field -->
            <fieldset class="mb-3">
                <form:label path="description">Description:</form:label>
                <form:input type="text" path="description" class="form-control" required="required" />
                <form:errors path="description" cssClass="text-danger" />
            </fieldset>
            
            <!-- Target Date Field -->
            <fieldset class="mb-3">
                <form:label path="targetDate">Target Date:</form:label>
                <form:input type="date" path="targetDate" class="form-control" required="required" />
                <form:errors path="targetDate" cssClass="text-danger" />
            </fieldset>
            
            <!-- Hidden Fields -->
            <form:input type="hidden" path="id" />
            <form:input type="hidden" path="done" />

            <!-- Submit Button -->
            <div class="mt-3">
                <input type="submit" class="btn btn-success" value="Add Todo" />
            </div>
        </form:form>
    </div>

    <!-- JavaScript Dependencies -->
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
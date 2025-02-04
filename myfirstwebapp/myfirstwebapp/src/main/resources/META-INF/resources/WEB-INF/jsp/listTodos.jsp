<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
          <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
          <title>List todos page</title>
    </head>
   <body>
   
         <%@ include file="common/navigation.jspf" %>
               <div class="container">
	               <h1>Your todos</h1>
	               <table class="table">
	               <table>
	                   <thread>
	                   <tr>
		                          <th>description</th>
	                          <th>Target Date</th>
	                          <th>Is Done?</th>
	                          <th></th>
	                    </tr>
	                    </thread>
	                    <tbody>
	                         <c:forEach items="${todos}" var="todo">
	                             <tr>
	                                
	                                <td>${todo.description}</td>
	                                 <td>${todo.targetDate}</td>
	                                  <td>${todo.done}</td>
	                                  <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a>
	                                  <td> <a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a>
</td>
	                             </tr>
	               
	                        </c:forEach>
	               </table>
	               <a href="add-todo" class="btn btn-success">Add-todo</a>
	                </div>
	               <script src=" webjars/bootstrap/5.1.3/js bootstrap.min.js"></script>
	               <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	              
	               
    </body>
</html>
<html>
    <head>
          <title>Login page</title>
    </head>
   <body>
   <div class="container">
   <h1>Login</h1>
            Welcome to the login page !
            <pre>${errorMessage}</pre>
            <form method="post">
            <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
            <input type="submit">
            </form> 
            </div>   
    </body>
</html>
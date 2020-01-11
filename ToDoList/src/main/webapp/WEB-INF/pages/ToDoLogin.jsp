<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <style type="text/css">
            .form-container {
                position: absolute;
                top: 15vh;
                background: #fff;
                padding: 30px;
                border-radius: 10px;
                border: 1px solid black;
                box-shadow: 0px 0px 10px 0px #000;
            }
            
            p {
                text-align: center;
            }
        </style> 

    </head>

    <body>
        <section class="container-fluid">
            <section class="row justify-content-center">
                <section class="col-12 col-sm-6 col-md-3">
                    <form class="form-container" action="verifyLogin.htm" method="POST">
                        <div class="form-group">
                            <p>Mail ID</p>
                            <input type="email" name="mail" id="name">
                        </div>
                        <div class="form-group">
                            <p>Password</p>
                            <input type="password" name="password" id="password">
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary btn-block" value="Sign in" id="submitButton">
                        </div>
                        <div class="form-group">
                            <input type="button" class="btn btn-primary btn-block" onclick="window.location.href='viewRegister.htm';" value="Sign up" id="signUpButton">
                        </div>
                    </form>
                </section>
            </section>
        </section>
        <!-- 
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
     	-->
        <script src="js/jQuery.js"></script>
        <script src="js/jquery.validate.js"></script>
    </body>

    </html>
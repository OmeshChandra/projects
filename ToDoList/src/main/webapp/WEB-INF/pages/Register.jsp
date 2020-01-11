<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <style>
            #mainSection {
                align-content: center;
            }
            
            .form-container {
                position: absolute;
                width: 75%;
                top: 15px;
                background: #fff;
                padding: 30px;
                margin-left: 50px;
                border-radius: 10px;
                border: 1px solid black;
                box-shadow: 0px 0px 10px 0px #000;
            }
            
            p {
                text-align: right;
            }
            
            #loading {
                position: fixed;
                width: 100%;
                height: 100vh;
                background: #fff url('loading/loading-gif-orange-5.gif') no-repeat center;
                z-index: 99999;
            }
        </style>
    </head>

    <body onload="loadingBody();">
        <div id="loading">
        </div>
        <section class="container-fluid">
            <section class="row justify-content-center" id="mainSection">
                <section class="col-12 col-sm-3 col-md-6">
                    <form class="form-container" id="register-form" action="register.htm" method="post">
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>First Name</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="text" name="firstName" placeholder="first name">
                            </div>
                        </div>
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>Middle Name</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="text" name="middleName" placeholder="middle name">
                            </div>
                        </div>
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>Last Name</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="text" name="lastName" placeholder="last name">
                            </div>
                        </div>
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>Contact</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="number" name="contact" placeholder="9876543210">
                            </div>
                        </div>
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>EMail</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="email" name="mail" placeholder="abc@xyz.com">
                            </div>
                        </div>
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>Password</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="password" name="password" id="password" placeholder="*******">
                            </div>
                        </div>
                        <div class="row form-group">
                            <div class="col-sm-12 col-md-6">
                                <p>Confirm Password</p>
                            </div>
                            <div class="col-sm-12 col-md-6">
                                <input type="password" name="password2" placeholder="*******">
                            </div>
                        </div>-                        
                        <div class="row form-group" id="submitButtonContainer">
                            <input type="submit" id="saveButton" class="btn btn-primary btn-block" value="Save">
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
        <script type="text/javascript">
            function loadingBody() {
                $('#loading').hide();
            }
            $(function() {
                $("#register-form").validate({
                    rules: {
                        firstname: {
                            required: true,
                            firstname: true
                        },
                        lastname: {
                            required: true,
                            lastname: true
                        },
                        contact: {
                            required: true,
                            contact: true
                        },
                        password: "required",
                        password2: {
                            required: true,
                            equalTo: "#password"
                        }

                    },
                    messages: {
                        firstname: {
                            required: 'Please enter your first name.'
                        },
                        lastname: {
                            required: 'Please enter your last name.'
                        },
                        contact: {
                            required: 'Please enter your contact number.'
                        }
                    }
                });
            });
        </script>
    </body>

    </html>
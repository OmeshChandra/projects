<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <style>
            h1 {
                text-align: center;
            }
            
            #toDoPanel {
                border: 1px solid black;
                width: 80%;
                height: 100%;
            }
            
            #calPanel {
                border: 1px solid black;
                width: 20%;
                height: 100%;
            }
            
            #container {
                width: 700px;
                height: 450px;
                margin: 70px auto;
            }
            
            #toDoPanel {
                width: 650px;
                height: 250px;
                margin: 0px auto;
            }
            
            body {
                justify-content: end;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <div class="row">
                <h1>ToDoList</h1>
            </div>
            <div class="row">
                <div id="toDoPanel" class="col-sm-8">

                </div>
                <div id="calPanel" class="col-sm-4">
                    <div></div>
                </div>
            </div>
        </div>
        <script src="js/jQuery.js"></script>
        <script src="js/jquery.validate.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script>
            $(document).ready(function() {
                $("#toDoPanel").tabs();
                $("ol").sortable({
                    axis: "y",
                    containment: "#toDoPanel"
                });
                $("ul").sortable({
                    axis: "x",
                    containment: "#toDoPanel"
                });
            });
        </script>
    </body>

    </html>
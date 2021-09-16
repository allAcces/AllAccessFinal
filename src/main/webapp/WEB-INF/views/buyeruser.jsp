<html>
    <head>
        <title>Buyer User Login</title>
          
        <link href="css/buyeruser.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-1.12.0.min.js" type="text/javascript"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/libs/jquery-cycle/jquery.cycle.all.js" type="text/javascript"></script>
        <script src="js/libs/jquery-easing/jquery.easing.min.js" type="text/javascript"></script>
        <script src="js/jquery.scrollbox.js" type="text/javascript"></script>
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <link href="font-awesome-icons/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script>
            $(document).ready(function (){
                $("#slider").cycle();
               
            });
        </script>
        
    </head>
    <body>
          <div class="container">
            <div class="row">
               <%@include file="buyeruser/header.jsp" %>
                
                
                <div class="col-lg-10 col-md-10 col-sm-10 top1">
                    <img src="images/logo2.png" alt="" class="pull-left"/>
                    <h4 class="text-center">  </h4>
                   
                        <h4  class="text-center">Welcome Buyer</h4>
                        
                </div>
                        <div class="col-lg-2 col-md-2 col-sm-2 top1">
                   <ul class="pull-right list-unstyled">
                        
                       <li><a href="/index"  style="color: #fff;font-family: cursive;font-size: 18px"><i class="fa fa-sign-in fa-lg"></i>Logout</a></li>
                  
                </ul>
                </div>  
                   
                       <%@include file="buyeruser/menu.jsp" %>
                       
                       <div class="col-lg-9 col-md-9 col-sm-9 top3" id="slider">
				<img src="images/a.jpg" alt="" class="img-responsive" /> <img
					src="images/b.jpg" alt="" class="img-responsive" /> <img
					src="images/c.jpg" alt="" class="img-responsive" /><img
					src="images/pic5.jpg" alt="" class="img-responsive" />
			</div>  
                         
                       
                   
                <%@include file="buyeruser/footer.jsp" %>
            </div>
          </div>
    </body>
</html>

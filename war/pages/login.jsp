<!DOCTYPE html>
<html lang="en">
     <head>
     <title>Iniciar sesi&oacute;n</title>
     <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
     <link rel="icon" href="images/favicon.png">
     <link rel="shortcut icon" href="images/favicon.png" />
     <link rel="stylesheet" href="css/style.css">
	 <link rel="stylesheet" href="css/zerogrid.css" type="text/css" media="screen">
	 <link rel="stylesheet" href="css/responsive.css" type="text/css" media="screen"> 
     <link rel="stylesheet" href="css/form.css">
     <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
     <link rel="stylesheet" href="css/tamales.css">
     
     <script src="js/jquery.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
     <script src="js/sForm.js"></script>
     <script src="js/Forms.js"></script>
	 <script src="js/css3-mediaqueries.js"></script>
     <!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
         </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <link rel="stylesheet" media="screen" href="css/ie.css">
    <![endif]-->
     </head>
    
<body>
<!--==============================header=================================-->
 <div class="main">
 <header> 
  <div class="zerogrid">
    <div class="col-full">
	<div class="wrap-col">
    <h1><a href="index.html"><img src="images/logo.png" alt="EXTERIOR"></a> </h1>
    
         <div class="menu_block">
           <nav>
            <ul class="sf-menu">
                   <li><a href="index.html">Inicio</a></li>
                   <li><a href="Productos.html">Productos</a></li>
                   <li><a href="Contactenos.html">Contactenos</a></li>
                 </ul>
           </nav>
           <div class="clear"></div>
           </div>
           <div class="clear"></div>
		</div>
      </div>
    </div>
</header>


<!--=======content================================-->
	<div class="content page1">
		<div class="loginFormDiv">
				<form action="/createUser" method="post" class="loginForm">
					<h1><span class="loginLabel">Inicia sesion</span> o <span class="signup">registrate</span></h1>
					<p class="centered">
						<a href="${loginUrl}" class="googleLoginButton">Sign in with Google</a>
					</p>										
					<p class="float">
						<label for="login"><i class="fa fa-envelope"></i>Correo electr&oacute;nico</label>
						<input type="text" name="email" placeholder="Correo electronico">
					</p>
					<p class="float">
						<label for="password"><i class="fa fa-lock"></i>Contrasena</label>
						<input type="password" name="contrasena" placeholder="contrasena" class="showpassword">
					</p>
					<p class="floatComplete">
						<label for="nombreParaMostrar"><i class="fa fa-envelope"></i>Nombre para mostrar:</label>
						<input type="text" name="nombreParaMostrar" placeholder="Nombre para Mostrar">
					</p>					
					<p class="clearfix">
						<input type="submit" name="submit" value="Crear usuario">
					</p>
				</form>
		</div>
	</div>

<!--fin del main -->
</div>

<!--==============================footer=================================-->

<footer>    
  <div class="zerogrid">
    <div class="col-full">
		<div class="wrap-col">
     Tamales Colombianos © 2014  &nbsp;&nbsp; |&nbsp;&nbsp;   <a href="#">Privacy Policy</a>    <!--&nbsp;&nbsp;|&nbsp;&nbsp; <a href="http://www.zerotheme.com/" rel="nofollow">Html5 Templates</a> designed by <a href="http://www.templatemonster.com/" rel="nofollow">TemplateMonster.com</a> - <a href="http://www.zerotheme.com/" rel="nofollow">Zerotheme.com</a>-->
	 	</div>
    </div>
  </div>
</footer>

</body>
</html>
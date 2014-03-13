<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
     <head>
     <title>Home</title>
     <meta charset="utf-8">
	 <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
     <link rel="icon" href="images/favicon.png">
     <link rel="shortcut icon" href="images/favicon.png" />
     <link rel="stylesheet" href="css/style.css">
     <link rel="stylesheet" href="css/slider.css">
	 <link rel="stylesheet" href="css/zerogrid.css" type="text/css" media="screen">
	<link rel="stylesheet" href="css/responsive.css" type="text/css" media="screen"> 
     <script src="js/jquery.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
     <script src="js/sForm.js"></script>
     <script src="js/jquery.carouFredSel-6.1.0-packed.js"></script>
     <script src="js/tms-0.4.1.js"></script>
	 <script src="js/css3-mediaqueries.js"></script>
     <script>
      $(window).load(function(){
      $('.slider')._TMS({
              show:0,
              pauseOnHover:false,
              prevBu:'.prev',
              nextBu:'.next',
              playBu:false,
              duration:800,
              preset:'fade', 
              pagination:true,//'.pagination',true,'<ul></ul>'
              pagNums:false,
              slideshow:8000,
              numStatus:false,
              banners:false,
          waitBannerAnimation:false,
        progressBar:false
      })  
      });
      
     $(window).load (
    function(){$('.carousel1').carouFredSel({auto: false,prev: '.prev',next: '.next', width: 960, items: {
      visible : {min: 1,
       max: 4
},
height: 'auto',
 width: 240,

    }, responsive: false, 
    
    scroll: 1, 
    
    mousewheel: false,
    
    swipe: {onMouse: false, onTouch: false}});
    
    
    });      

     </script>
     <!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
         </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script type="text/javascript" src="js/tamales.js"></script>
      <script type="text/javascript" src="js/noty/packaged/jquery.noty.packaged.min.js"></script>
      <link rel="stylesheet" media="screen" href="css/ie.css">

    <![endif]-->
     </head>
     <body>
      
 <!--==========================Login=====================================-->
 
 <div class="login">
	 <c:if test="${usuarioRegistrado}">
	 	<h4>Bienvenido Gabriel</h4> <a href="${logoutUrl}" >Salir</a>
	 </c:if>
	 <c:if test="${!usuarioRegistrado}">
	 	<a href="/login"><h4>Iniciar sesi&oacute;n</h4></a>
	 </c:if>	 
 </div>

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
                   <li class="current"><a href="index.html">Inicio</a></li>
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
 <div class="slider-relative">
    <div class="slider-block">
      <div class="slider">
        <ul class="items">
          <li><img src="images/slide_Tamal.jpg" alt=""></li>
          <li><img src="images/slide1_Tamal.jpg" alt=""></li>
          <li class="mb0"><img src="images/slide2_Tamal.jpg" alt=""></li>
        </ul>
      </div>
    </div>
 </div>
<!--=======content================================-->

<div class="content page1">
  <div class="zerogrid">
      <div class="row">
      <div class="col-3-5">
	  	<div class="wrap-col">
	        <h2>Bienvenidos</h2>
	        <div class="page1_block col1">
				<div class="col-1-3"><img src="images/welcome_img.png" alt=""></div>
				<div class="col-2-3">
		          <div class="extra_wrapper">
		            <p><span class="col2"><a href="http://blog.templatemonster.com/free-website-templates/" rel="nofollow">Click here</a></span> for more info about this free website template created by TemplateMonster.com </p>
		            Aenean nonummy hendrerit mau rellus porta. Fusce suscipit varius m sociis natoque penaibet magni parturient montes nasetur ridiculumula dui. <br>
		            <!--<a href="#" class="btn">more</a>-->
		          </div>
			  </div>-->
	          <div class="clear"></div>
	        </div>
		</div>
      </div>
      <div class="col-2-5">
	  	<div class="wrap-col">
	        <h2>Característica</h2>
	        <ul class="list">
	          <li><a href="#">Unlimited consultations and/or planning</a></li>
	          <li><a href="#">Expert advice on traditions, customs, aetiquette</a></li>
	          <li><a href="#">Determine and stay within budget</a></li>
	          <li><a href="#">Choosing the right Wedding Venue</a></li>
	          <li><a href="#">Provide preferred vendor's list</a></li>
	          <li><a href="#">Assist with wedding scheme and design</a></li>
	        </ul>
		</div>
      </div>
      </div>
      <div class="col-full">
        <div class="hor_separator"></div>
      </div>
	  <div class="row">
      <div class="col-full">
	  	<div class="wrap-col">
        <div class="car_wrap">
        <h2>Nuestro menú</h2>
        <a href="#" class="prev"></a><a href="#" class="next"></a>
        <ul class="carousel1">
          <li><div><img src="images/page1_img1.jpg" alt="">
          <div class="col1 upp"> <a href="#">Tamal Vegetariano</a></div>
          <!--<span> Dorem ipsum dolor amet consectetur</span>-->
          <div class="price">00€</div></div>
          </li>
          <li><div><img src="images/page1_img2.png" alt="">
          <div class="col1 upp"> <a href="#">Tamal Infantil</a></div>
          <!--<span> Dorem ipsum dolor amet consectetur</span>-->
          <div class="price">00€</div></div>
          </li>
          <li><div><img src="images/page1_img3.jpg" alt="">
          <div class="col1 upp"> <a href="#">Tamal Típico</a></div>
          <!--<span> Dorem ipsum dolor amet consectetur</span>-->
          <div class="price">00€</div></div>
          </li>
          <li><div><img src="images/page1_img4.jpg" alt="">
          <div class="col1 upp"> <a href="#">Tamal Grande</a></div>
          <!--<span> Dorem ipsum dolor amet consectetur</span>-->
          <div class="price">00€</div></div>
          </li>
          <!--<li><div><img src="images/page1_img3.jpg" alt="">
          <div class="col1 upp"> <a href="#">Lorem ipsum doamet consectet kim</a></div>
          <span> Dorem ipsum dolor amet consectetur</span>
          <div class="price">10€</div></div>
          </li>-->
        </ul>
      </div>
	  </div>
    </div>
	</div>
	<div class="row">
    <div class="bottom_block">
      <div class="col-1-2">
        <h3>Siguenos en</h3>
        <div class="socials">
          <a href="#"></a>
          <a href="#"></a>
          <a href="#"></a>
        </div>
        <nav><ul>
                   <li class="current"><a href="index.html">inicio</a></li>
                   
                   <li><a href="Productos.html">Productos</a></li>
                   <li><a href="Contactenos.html">Contactenos</a></li>
                 </ul></nav>
      </div>
      <div class="col-1-2">
        <h3>Actualiza tu Email</h3>
        <p class="col1">Join our digital mailing list and get news<br> deals and be first to know about events</p>
        <form id="newsletter">
                  <div class="success">Your subscribe request has been sent!</div>
                  <label class="email">
                       <input type="email" value="Enter e-mail address" >
                       <a href="#" class="btn" data-type="submit">subscribe</a> 
                        <span class="error">*This is not a valid email address.</span>
                  </label> 
              </form> 
          </div>
      </div>
	  </div>
    </div>
  </div>
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

<script>
	jQuery(document).ready(function(){
		<c:if test="${existsErrorMessage}">
			showErrorMessage('${errorMessage}');		
		</c:if>
	
		<c:if test="${existSuccessMessage}">
			showSuccessMessage('${successMessage}');		
		</c:if>										
		   
	});
</script>

</body>
</html>
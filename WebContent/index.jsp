<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Consultorías ZAMBRANO</title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <link href="https://fonts.googleapis.com/css2?family=Shrikhand&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="carpetaplantilla/estilo/css.css">
	<link rel="shortcut icon" href="../carpetaplantilla/img/icon.png">
</head>
<body style="background-image: url(https://jrs.digital/wp-content/uploads/2019/11/office-3295556_1920.jpg);background-size: cover; background-repeat: no-repeat; background-attachment: fixed;" >
	<br>
<aside><br><br><br>
  <div class="row justify-content-center align-self-center"  >
    <div class="col col-sm-8 col-md-8 col-lg-4 col-xl-4 h-100" id="level1">
      <h2 id="nom">Consultorias Zambrano</h2>
      <h5 id="nom2">Sector de Ingenieria</h5>
      <hr>
        <form id="formLogin" method="get" action="AccesoControl">
 
          <div class="form-group row"><br>
        
            <label for="inputEmail3" style="text-align: left;" class="col-sm-3 col-form-label">Cedula</label>
            <div class="col-sm-9">
            <input type="text" class="form-control" name="cedula" placeholder="Cedula" required="Llena este campo">
           </div>
          </div>
          <div class="form-group row">
           <label for="inputPassword3" style="text-align: left;" class="col-sm-3 col-form-label">Contraseña</label>
          <div class="col-sm-9">
          <input type="password" class="form-control" name="pass" placeholder="Contraseña" required="Llena este campo">
          </div>
         </div>
  <div class="col-sm-12">
      <button type="submit" name="accion" value="ingreso" class="btn btn-dark" >Iniciar Sesión</button><br><br>
    </div>

  </form>
</div>
</div>
</aside>

<footer class="bg-dark rounded-top text-center">
  <div class="container py-1">
    <p class="text-white my-2s">
      Derechos Reservados - 2020
    </p>
  </div>
</footer>
</body>
</html>
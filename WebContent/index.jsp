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
  <link href="https://fonts.googleapis.com/css2?family=Satisfy&display=swap" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="carpetaplantilla/estilo/loginStyle.css">
  <link rel="shortcut icon" href="../carpetaplantilla/img/icon.png">
</head>
<body >
  <div class="modal-dialog text-center">
        <div class="col-sm-8 main-section">
            <div class="modal-content">
                <div class="col-12 user-img">
                    <img src="carpetaplantilla/img/zam.png" />
                    <h3>Consultorías Zambrano</h3>
                </div>

                <form id="formLogin" class="col-12" action="AccesoControl" method="post">
                    <div class="form-group" id="user-group">
                        <input type="text" class="form-control" placeholder="Cedula" name="cedula"required="Llena este campo"/>
                    </div>
                    <div class="form-group" id="contrasena-group">
                        <input type="password" class="form-control" placeholder="Contraseña" name="pass" required="Llena este campo"/>
                    </div>
                    <button type="submit" name="accion" value="ingreso" class="btn btn-primary"><i class="fas fa-sign-in-alt"></i>  Ingresar </button>
                    <div class="form-group"> <a href="WebApp/loginEmpleado.jsp" style=" text-decoration: none; " ><u>O inicie sesión como Empleado</u></a> </div>
                </form>
                
                
            </div>
        </div>
    </div>
</body>

</body>
</html>
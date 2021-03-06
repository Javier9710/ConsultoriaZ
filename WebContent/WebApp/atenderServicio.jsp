<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Servicios</title>

  <!-- Custom fonts for this template-->
  <link href="../carpetaplantilla/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
  <link rel="shortcut icon" href="../carpetaplantilla/img/icon.png">

  <!-- Custom styles for this template-->
  <link href="../carpetaplantilla/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
   

    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar  static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                <form class="form-inline mr-auto w-100 navbar-search">
                  <div class="input-group">
                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                      <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </li>

            <!-- Nav Item - Alerts -->
            

            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Empleado</span>
                <img class="img-profile rounded-circle" src="https://toppng.com/uploads/preview/user-font-awesome-nuevo-usuario-icono-11563566658mjtfvilgcs.png" >
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                
                <a class="dropdown-item" href="#" >
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Cerrar Sesi�n
                </a>
              </div>
            </li>

          </ul>

        </nav>
    </div>


       
       <div class="container-fluid" style="background-image: url(https://www.publicdomainpictures.net/pictures/280000/velka/gradient-yellow-to-blue-background.jpg); height: 100%;" ><br><br>
         <div class="row justify-content-center align-self-center" >

            <div class="col col-sm-9 col-md-9 col-lg-6 col-xl-6 h-100" style="background-color: #a7c0cd

;" style="border-radius: 20px;">
              
                <form method="get" action="../AtenderControl" enctype="multipart/form-data">
                  
               <legend class="text-center header" style="color: black;">Atender Servicio</legend>
               
               <div class="form-group">
                    <input _ngcontent-c0="" class="form-control" name="id" placeholder="Id Atencion" type="text" required>
                </div>

                <div class="form-group">
                    <input _ngcontent-c0="" class="form-control" name="nombre" placeholder="Nombre Atencion" type="text" required>
                </div>
               
               <div class="form-group">
                    <select class="form-control" name="tipo" >
                      <option>Tipo</option>
                      <option value="1">Virtual</option>
                      <option value="2">Presencial</option>
                      
                   </select>
                </div>

                <div class="form-row">
            
                   <div class="col">
                    <label  class="" style="color: black;">Fecha de Atenci�n:</label>
                       <input type="date" name="fecha" class="form-control" placeholder="First name">
                   </div>
                   <div class="col">
                    <label  class="" style="color: black;">Hora de Atenci�n:</label>
                       <input type="time" name="hora" class="form-control" placeholder="Last name">
                  </div>
                </div><br>
                
                <div class="form-group">
                    <textarea _ngcontent-c0="" class="form-control" name="descripcion" placeholder="Descripcion" type="text" required></textarea>
                </div>


                 <div class="form-group">
                  <div class="col-md-12 text-center">
                    <button  type="submit" value="atenderServicio" name="accion" style="width: 40%;" class="btn btn-primary" >Atender</button>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-md-12 text-center">
                    <a href="inicioEmpleado.jsp"> <-Volver al inicio</a>
                  </div>
                </div>
               
              </form>
              
            </div>
          </div><br><br>
          <br><br>
          <br><br>

</div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white" >
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2020</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  

  <!-- Bootstrap core JavaScript-->
  <script src="../carpetaplantilla/vendor/jquery/jquery.min.js"></script>
  <script src="../carpetaplantilla/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="../carpetaplantilla/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../carpetaplantilla/js/sb-admin-2.min.js"></script>

</body>

</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Listar Cliente</title>

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
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="inicio.jsp">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-file"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Consultorias Zambrano</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Heading -->
      

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-user"></i>
          <span>Empleado</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="regEmpleado.jsp">Registrar Empleado</a>
            <a class="collapse-item" href="../EmpleadoControl?accion=listar">Listar Empleados</a>
          </div>
        </div>
      </li>
      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseCliente" aria-expanded="true" aria-controls="collapseCliente">
          <i class="fas fa-fw fa-user"></i>
          <span>Cliente</span>
        </a>
        <div id="collapseCliente" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="regCliente.jsp">Registrar Cliente</a>
            <a class="collapse-item" href="../ClienteControl?accion=listar">Listar Cliente</a>
          </div>
        </div>
      </li>

       <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-file"></i>
          <span>Servicio</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="regServicio.jsp">Registrar Servicio</a>
            <a class="collapse-item" href="../ServicioControl?accion=listar">Listar Servicios</a>
            
          </div>
        </div>
      </li>
      
        <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    
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
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Admin</span>
                <img class="img-profile rounded-circle" src="https://toppng.com/uploads/preview/user-font-awesome-nuevo-usuario-icono-11563566658mjtfvilgcs.png" >
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                
                <a class="dropdown-item" href="../AccesoControl?accion=cerrar" >
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Cerrar Sesi�n
                </a>
              </div>
            </li>

          </ul>

        </nav>
    </div>
    
    <div class="container-fluid" style="background-image: url(https://www.publicdomainpictures.net/pictures/280000/velka/gradient-yellow-to-blue-background.jpg); height: 100%;" ><br>
        <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Listado de Clientes</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
          
          <jsp:useBean id="cD1" class="Dao.ClienteDao" scope="request"></jsp:useBean>
          
           <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
      <thead>
        <tr>
          
          <th style="text-align: center" scope="col">Nit</th>
          <th style="text-align: center" scope="col">Nombre</th>
          <th style="text-align: center" scope="col">Registro</th>
          <th style="text-align: center" scope="col">Direccion</th>
          <th style="text-align: center" scope="col">Contacto</th>
          <th style="text-align: center" scope="col">Acciones</th>
        </tr>
      </thead>

      <tbody>



        <c:forEach var="c" items="${cD1.listar()}">

          <tr>
            
            <td style="text-align: center"><c:out value="${c.nit}"/></td>
            <td style="text-align: center"><c:out value="${c.nombre}"/></td>
            <td style="text-align: center"><c:out value="${c.registro}"/></td>
            <td style="text-align: center"><c:out value="${c.direccion}"/></td>
            <td style="text-align: center"><c:out value="${c.contacto}"/></td>
            <td>
          <form action="../ClienteControl" method="get">
            <input type="hidden" name="id" value="${c.nit}">
            <div style="text-align: center" class="form-group row">
              <div class="col-sm-12">
                <button type="submit" name="accion" value="editar"
                  class="btn btn-primary">Editar</button>
                <button type="submit" name="accion" value="eliminar"
                  class="btn btn-primary">Eliminar</button>
              </div>
            </div>
          </form>
        </td>
          </tr>

        </c:forEach>



      </tbody>

    </table>

       </div>
      </div>
  </div>
      <!-- End of Main Content -->
      
 <!-- Footer -->
      <footer class="sticky-footer bg-white" style="position: absolute;
  bottom: 0; width: 81%;">
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
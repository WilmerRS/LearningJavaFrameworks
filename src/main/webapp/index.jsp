<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>JSP - Hello World</title>
    <link
      rel="stylesheet"
      href="style/bootstrap-5.0.0-dist/css/bootstrap.min.css"
    />
    <script src="style/bootstrap-5.0.0-dist/js/bootstrap.min.js"></script>
  </head>
  <body>
    <header class="pb-4">
      <%@ include file="components/header/header.jsp" %>
    </header>
    <main class="flex-shrink-0">
      <h1 class="text-center"><%= "Tabla de docentes" %></h1>
      <!-- <br/>
    <a href="hello-servlet">Hello Servlet</a> -->
      <%@ include file="components/table-bd/tablebd.jsp" %>
    </main>
    <footer class="pt-4">
      <%@ include file="components/footer/footer.jsp" %>
    </footer>
  </body>
</html>

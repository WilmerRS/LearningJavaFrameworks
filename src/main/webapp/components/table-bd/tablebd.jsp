<%@ page import="java.util.ArrayList" %>
<%@ page import="com.jspbd.jsp_db_1.docente.DocenteModel" %>
<%@ page import="com.jspbd.jsp_db_1.docente.DocenteController" %><%--
  Created by IntelliJ IDEA.
  User: wilmer
  Date: 5/7/21
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="container px-2">
  <table class="table table-light table-striped table-hover">
    <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido</th>
      <th scope="col">Fecha de nacimiento</th>
      <th scope="col">Salario</th>
    </tr>
    </thead>
    <tbody>
    <%
      DocenteController dc = new DocenteController();
      ArrayList<DocenteModel> docentes = dc.getDocentes();
      for(DocenteModel doc: docentes){ %>
          <tr>
            <td><%= doc.getId() %></td>
            <td><%= doc.getNombre() %></td>
            <td><%= doc.getApellido() %></td>
            <td><%= doc.getFecha() %></td>
            <td><%= doc.getSalario() %></td>
          </tr>
    <% }%>
    </tbody>
  </table>
</div>

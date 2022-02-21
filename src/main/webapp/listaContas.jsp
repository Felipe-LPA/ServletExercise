<%@ page import="java.util.List" %>
<%@ page import="com.example.santander.model.ContaModel" %><%--
  Created by IntelliJ IDEA.
  User: cinth
  Date: 16/02/2022
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Contas cadastradas até o momento.</h1>
    <ul>
        <%
            List<ContaModel> contas = (List)request.getAttribute("contas");
            for(ContaModel contaModel: contas){
        %>
                <li>Número da Conta: <%= contaModel.getAccountNumber()%></li>
                <li>Número da Agência: <%= contaModel.getAgencyNumber()%></li>
                <li>Número do Cliente: <%= contaModel.getClientId()%></li>
                <li>Nome do Banco: <%= contaModel.getBankName()%></li>
        <br>
        <hr>
        <br>
      <%
          }
      %>
    </ul>
    <a href="/santander/cadastroConta">Cadastrar um novo cliente</a>
</body>
</html>

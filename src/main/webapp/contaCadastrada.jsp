<%
   String accountNumber = (String)request.getAttribute("accountNumber");
%>
<html>
<head>
    <title>Cliente Cadastrado</title>
</head>
<body>
    <h1> <%= accountNumber%> Cadastrado com sucesso</h1>
    <a href="/santander/cadastroConta">Cadastrar um novo cliente</a><br>
    <a href="/santander/contas">Listar contas cadastradas</a>
</body>
</html>

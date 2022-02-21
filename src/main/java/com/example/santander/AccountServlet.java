package com.example.santander;

import com.example.santander.model.ContaModel;
import com.example.santander.model.ListaConta;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListarContas", value = "/contas")
public class AccountServlet extends HttpServlet {

    ListaConta listaContas = new ListaConta();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContaModel conta = new ContaModel(
                request.getParameter("accountNumber"),
                request.getParameter("agencyNumber"),
                request.getParameter("clientId"),
                request.getParameter("bankName")
        );


        listaContas.adiciona(conta);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contaCadastrada.jsp");
        request.setAttribute("accountNumber", conta.getAccountNumber());
//        request.setAttribute("agencyNumber", conta.getAgencyNumber());
//        request.setAttribute("clientId", conta.getClientId());
//        request.setAttribute("bankName", conta.getBankName());
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ContaModel> contas = listaContas.buscaConta();

        request.setAttribute("contas", contas);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaContas.jsp");
        requestDispatcher.forward(request, response);

    }



}

package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ListaConta {
    private static List<ContaModel> contas = new ArrayList<>();

    public void adiciona(ContaModel contaModel){
        ListaConta.contas.add(contaModel);
    }

    public List<ContaModel> buscaConta(){
        return ListaConta.contas;
    }
}

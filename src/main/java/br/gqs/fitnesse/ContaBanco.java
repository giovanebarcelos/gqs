package br.gqs.fitnesse;

import java.util.*;

public class ContaBanco {
    private HashMap<String, Double> contas = new HashMap<String, Double>();
    private HashMap<String, List<String>> 
    historicoDeTransacoes = new HashMap<String, List<String>>();

    public void criarConta(String codigoConta,
            double saldoInicial) throws Exception {
        if (contas.containsKey(codigoConta)) {
            throw new Exception("Código " +
                    codigoConta + " já existe!");
        }
        contas.put(codigoConta, saldoInicial);
        historicoDeTransacoes.put(codigoConta, new ArrayList<>());
        historicoDeTransacoes.get(codigoConta).add(saldoInicial + "saldo inicial");
    }

    public double mostrarSaldoDaConta(String codigoConta) throws Exception {
        if (!contas.containsKey(codigoConta)) {
            throw new Exception("Código " +
                    codigoConta + " não existe!");
        }
        return contas.get(codigoConta);
    }

    public void depositar(String codigoConta, double valor){
        contas.put(codigoConta, contas.get(codigoConta) + valor);
        historicoDeTransacoes.get(codigoConta).add(valor + " depósito");
    }

}

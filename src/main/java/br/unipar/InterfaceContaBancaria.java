package br.unipar;

public interface InterfaceContaBancaria {

    Double obterSaldo();

    void depositar(Double valor);

    String retornarNumeroConta();

    Boolean saque(Double Valor);



}

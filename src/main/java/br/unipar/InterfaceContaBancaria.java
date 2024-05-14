package br.unipar;

public interface InterfaceContaBancaria {

    Double obterSaldo();

    void depositar(double valor);

    String retornarNumeroConta();

    boolean saque(double Valor);



}

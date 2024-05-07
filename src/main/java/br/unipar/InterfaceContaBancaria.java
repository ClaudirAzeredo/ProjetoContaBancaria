package br.unipar;

public interface InterfaceContaBancaria {

    Double obterSaldo(Double valor);

    void depositar();

    void depositar(Double valor);

    String retornarNumeroConta();

    Boolean saque(Double Valor);



}

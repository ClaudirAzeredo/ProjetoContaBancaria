package br.unipar;

public class ContaCorrente extends HerancaContaBancaria {


    @Override
    public boolean saque(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }

        return false;
    }
}

package br.unipar;

public abstract class ContaCorrente extends HerancaContaBancaria {


    @Override
    public Boolean saque(Double Valor) {

        if (saldo >= valor ){
            saldo -= valor;
            return true;
        }


        return false;
    }
}

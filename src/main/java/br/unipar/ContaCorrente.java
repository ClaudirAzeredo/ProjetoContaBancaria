package br.unipar;

public class ContaCorrente extends HerancaContaBancaria {


    @Override
    public Boolean saque(Double valor) {

        if (saldo >= valor ){
            saldo -= valor;
            return true;
        }


        return false;
    }
}

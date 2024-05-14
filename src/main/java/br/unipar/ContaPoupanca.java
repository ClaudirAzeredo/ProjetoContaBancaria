package br.unipar;

    public class ContaPoupanca extends HerancaContaBancaria {

    @Override
        public boolean saque (double valor) {


        if (saldo >= valor){
            saldo -= valor;
            saldo -= 5;

            return true;



        }
    return false;
}
}



import br.unipar.ContaCorrente;
import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {


    @Test
    public void testDepositoContaCorrente() {

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000d);

    }

    @Test
    public void TestSaqueContaCorrente() {

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);


        assertTrue(validacao);

        assertEquals(1500d, conta.obterSaldo());

    }

    @Test
    public void TestSaqueMaiorContaCorrente() {

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000);
        boolean validacao = conta.saque(4500);


        assertFalse(validacao);

        assertEquals(3000, conta.obterSaldo());

    }

    @Test
    public void testDepositoContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000);

    }

    @Test
    public void TestSaqueContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3500d);
        boolean validacao = conta.saque (1500);


        assertTrue(validacao);

        assertEquals(1995, conta.obterSaldo());

    }
    @Test
    public void TestSaqueTaxaContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque (1500d);


        assertTrue(validacao);

        assertEquals(1495, conta.obterSaldo());

    }
    @Test
    public void TestSaqueMaiorContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000);
        boolean validacao = conta.saque(4500);


        assertFalse(validacao);

        assertEquals(3000, conta.obterSaldo());

    }

}

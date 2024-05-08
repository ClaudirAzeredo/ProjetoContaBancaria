import br.unipar.ContaCorrente;
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
        conta.saque(1500d);

        assertEquals(1500d, conta.obterSaldo());

    }

}
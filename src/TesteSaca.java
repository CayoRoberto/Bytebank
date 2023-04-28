
public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new ContaCorrente(123, 3445);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Erro de Exceção: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}

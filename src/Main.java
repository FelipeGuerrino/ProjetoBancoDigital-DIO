public class Main {

	public static void main(String[] args) {		
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		
		ContaCorrente cc = new ContaCorrente(felipe);
		Conta poupanca = new ContaPoupanca(felipe);

		cc.depositar(5000);
		cc.transferir(1900, poupanca);
		cc.investir(500);
		
		cc.imprimirExtrato();
		cc.imprimirRendimento();
		poupanca.imprimirExtrato();
		poupanca.imprimirRendimento();
	}

}

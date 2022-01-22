
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	
	@Override
	public void imprimirRendimento(){
		double rendimentoPoupanca = this.saldo * 0.005;
		System.out.println("=== Rendimento do próximo mês ===");
		System.out.println(String.format("Rendimento poupança: %.2f", rendimentoPoupanca));
		System.out.println(String.format("Saldo total poupança: %.2f", (rendimentoPoupanca + this.saldo)));
	}

	
}

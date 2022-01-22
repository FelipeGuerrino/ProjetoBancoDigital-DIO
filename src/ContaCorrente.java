
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	double valorInvestido;
	double rendimentoCDI; 

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	public void investir(double valor) { //"investe" o valor no CDI (baseado em 100% da taxa de 7,65% anual)
		this.sacar(valor);
		this.valorInvestido += valor;
	}

	@Override
	public void imprimirRendimento(){
		rendimentoCDI = valorInvestido * 0.0765;
		System.out.println("=== Rendimento anual dos investimentos ===");
		System.out.println(String.format("Valor investido: %.2f", this.valorInvestido));
		System.out.println(String.format("Rendimento CDI: %.2f", this.rendimentoCDI)); 
		System.out.println(String.format("Saldo resgatável: %.2f", (this.rendimentoCDI + valorInvestido)));
	}

	
}

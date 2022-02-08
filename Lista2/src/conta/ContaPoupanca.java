package conta;

public class ContaPoupanca extends Conta {

	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca( int numeroConta, Correntista correntista, double saldo) {
		super(numeroConta, correntista, saldo);
	}
	
	public String atualizarSaldo(double valorJuros){
		setSaldo(this.getSaldo() + valorJuros);
		return "Saldo atualizado com juros = " + this.getSaldo();
	}
}

package conta;

public class ContaEspecial extends Conta {
private double limite;
	
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial( int numeroConta, Correntista correntista, double saldo, double limite) {
		super(numeroConta, correntista, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimete(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor){
		if(this.getSaldo() - valor >= this.limite) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}else {
			return false;
		}
			
	}
	
	public String extrato() {
		return "Extrato \n| Saldo R$ " + this.getSaldo() + " | Limite R$ "+this.limite + " | Limite Disponível R$ " + (this.getSaldo() + this.limite);
	}
}

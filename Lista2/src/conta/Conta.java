package conta;

public class Conta {

		protected int numeroConta;
		protected Correntista correntista;
		protected double saldo;
		
		
		public Conta() {
		
		}
		
		public Conta(int numeroConta, Correntista correntista, double saldo) {
			this.numeroConta = numeroConta;
			this.correntista = correntista;
			this.saldo = saldo;
			
		}

		public int getNumeroConta() {
			return numeroConta;
		}

		public void setCodigo(int numeroConta) {
			this.numeroConta = numeroConta;
		}

		public Pessoa getCorrentista() {
			return correntista;
		}

		public void setCorrentista(Correntista correntista) {
			this.correntista = correntista;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
		
		public boolean sacar(double valor){
			if(this.saldo - valor >= valor) {
				this.saldo = this.saldo - valor;
				return true;
			}else {
				return false;
			}
				
		}
		
		public void depositar(double valor){
				//this.saldo = this.saldo + valor;
				this.saldo+= valor;			
		}

}

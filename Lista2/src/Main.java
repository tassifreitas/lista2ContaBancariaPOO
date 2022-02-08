import javax.swing.JOptionPane;

import conta.ContaEspecial;
import conta.ContaPoupanca;
import conta.Correntista;


public class Main {
	public static void main(String[] args) {
				Correntista correntista = new Correntista();
				
				String nome = JOptionPane.showInputDialog("Informe o nome: ");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
				long cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
				long rg = Long.parseLong(JOptionPane.showInputDialog("Informe o RG: "));
				long telefone = Long.parseLong(JOptionPane.showInputDialog("Informe o n° Telefone: "));
				String email = JOptionPane.showInputDialog("Informe o email: ");
				
				
				correntista.setNome(nome);
				correntista.setIdade(idade);
				correntista.setCpf(cpf);
				correntista.setRg(rg);
				correntista.setCelular(telefone);
				correntista.setEmail(email);
				
				
				//impressão das informações informadas
				System.out.println("----Informações correntista----");
				System.out.println("Nome ...............: " + correntista.getNome());
				System.out.println("Idade ...............: " + correntista.getIdade());
				System.out.println("CPF ...............: " + correntista.getCpf());
				System.out.println("RG ...............: " + correntista.getRg());
				System.out.println("Celular ...............: " + correntista.getCelular());
				System.out.println("Email ...............: " + correntista.getEmail());
				System.out.println("----------------------------------------------------------");
		
				System.out.println("\nInformacoes conta especial\n " );
				ContaEspecial especial = new ContaEspecial(3333, correntista, 1500, 500);
				System.out.println("Numero da Conta ...............: " + especial.getNumeroConta());
				System.out.println("Saldo ...............: " + especial.getSaldo());
				double saque = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja sacar: "));
				System.out.println(especial.sacar(saque));
				System.out.println("Saldo após saque...............: " + especial.getSaldo());
				double deposito = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja depositar: "));
				especial.depositar(deposito);
				System.out.println("Saldo após deposito...............: " + especial.getSaldo());
				System.out.println(especial.extrato());
				System.out.println("----------------------------------------------------------");
				
				System.out.println("\nInformacoes conta poupanca\n " );
				ContaPoupanca poupanca = new ContaPoupanca(3333,correntista, 2500.00);
				System.out.println("Numero da Conta ...............: " + poupanca.getNumeroConta());
				System.out.println("Saldo ...............: " + poupanca.getSaldo());
				double valorJuros= 325.05;
				System.out.println("O valor de rendimento = ...............: " + valorJuros);
				System.out.println( poupanca.atualizarSaldo(valorJuros));
	}
}

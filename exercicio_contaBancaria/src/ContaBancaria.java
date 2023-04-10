package programasTeste;

public class ContaBancaria {
	String nomeCliente;
	int numConta;
	float saldo;
	
	float getSaldo() {
		return this.saldo;
	}

	void setSaldo(float novoSaldo) {
		this.saldo = novoSaldo;
	}

	public void sacar(float valor) {
		if(valor > this.saldo) {
			System.out.println("O seu saldo não é suficiente");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("Valor liberado");
		}
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
}
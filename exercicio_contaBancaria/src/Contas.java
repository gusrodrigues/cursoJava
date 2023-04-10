package programasTeste;

public class Contas {
	public static void main(String[] args) {
		//Conta bancária
		ContaBancaria cb = new ContaBancaria();
		cb.nomeCliente = "Cliente1";
		cb.numConta = 1;
		cb.saldo = 1024f;
		
		System.out.println("Valor atual: " + cb.saldo);

		System.out.println("Sacando... ");
		cb.sacar(100f);

		cb.depositar(500f);		
		System.out.println("Valor atual: " + cb.saldo);
		
		//Conta poupanca
		ContaPoupanca cp = new ContaPoupanca();
		cp.nomeCliente = "Cliente2";
		cp.numConta = 2;
		cp.saldo = 1024f;

		System.out.println("Valor atual: " + cp.saldo);
		cp.calcularNovoSaldo(9);
		System.out.println("Valor com rendimentos: " + cp.saldo);
		

		//Conta especial
		ContaEspecial ce = new ContaEspecial();
		ce.nomeCliente = "Cliente3";
		ce.numConta = 2;
		ce.saldo = 1024f;
		
		System.out.println("Cliente: " + ce.nomeCliente);
		System.out.println("Conta:   " + ce.numConta);
		System.out.println("Saldo:   R$ " + ce.saldo);
	}
}
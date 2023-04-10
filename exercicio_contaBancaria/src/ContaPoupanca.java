package programasTeste;

public class ContaPoupanca  extends ContaBancaria {
	int diaDeRendimento;

	public void calcularNovoSaldo(int taxa) {
		float novoSaldo = ((taxa/100f) * super.getSaldo() + super.getSaldo());
		super.setSaldo(novoSaldo);
	}
}
package programasTeste;

public class ContaEspecial extends ContaBancaria {
	float limite;

	//redefini��o do m�todo sacar, permitindo saldo negativo at� o valor do limite.
	@Override
	public void sacar(float valor) {
		if(valor > super.saldo) {
			System.out.println("ERRO");
		} else {
			super.saldo  = super.saldo - valor;
		}
	}
}
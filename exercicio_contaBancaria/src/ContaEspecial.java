package programasTeste;

public class ContaEspecial extends ContaBancaria {
	float limite;

	//redefinição do método sacar, permitindo saldo negativo até o valor do limite.
	@Override
	public void sacar(float valor) {
		if(valor > super.saldo) {
			System.out.println("ERRO");
		} else {
			super.saldo  = super.saldo - valor;
		}
	}
}
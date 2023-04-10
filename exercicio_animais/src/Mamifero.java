package programasTeste;

public class Mamifero extends Animal {
	String alimento;

	void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	String getAlimento() {
		return this.alimento;
	}

	void dados() {
		System.out.println("Animal: " + super.nome);
		System.out.println("Comprimento: " + super.comprimento + " cm");
		System.out.println("Patas: " + this.patas);
		System.out.println("Cor: " + super.cor);
		System.out.println("Ambiente: " + super.ambiente);
		System.out.println("Velocidade: " + super.velocidade + " m/s");
		System.out.println("Alimento: " + this.alimento);
		System.out.println("------------------------------");
	}
}
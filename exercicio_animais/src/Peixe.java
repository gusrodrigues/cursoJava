package programasTeste;

public class Peixe extends Animal {
	String caracteristica;

	void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	String getCaracteristica() {
		return this.caracteristica;
	}

	void dados() {
		System.out.println("Animal: " + super.nome);
		System.out.println("Comprimento: " + super.comprimento + " cm");
		System.out.println("Patas: " + this.patas);
		System.out.println("Cor: " + super.cor);
		System.out.println("Ambiente: " + super.ambiente);
		System.out.println("Velocidade: " + super.velocidade + " m/s");
		System.out.println("Caracteristica: " + this.caracteristica);
		System.out.println("------------------------------");
	}
}

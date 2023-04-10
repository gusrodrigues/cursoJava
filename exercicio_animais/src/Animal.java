package programasTeste;

public class Animal {
	String nome;
	String cor;
	String ambiente;
	int comprimento;
	float velocidade;
	int patas;

	void setNome(String nome) {
		this.nome = nome;
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	void setPatas(int patas) {
		this.patas = patas;
	}

	String getCor() {
		return this.cor;
	}

	String getAmbiente() {
		return this.ambiente;
	}

	int getComprimento() {
		return this.comprimento;
	}

	float getVelocidade() {
		return this.velocidade;		
	}

	int getPatas() {
		return this.patas;
	}		
		
	void dados() {
		System.out.println("Animal: " + this.nome);
		System.out.println("Comprimento: " + this.comprimento + " cm");
		System.out.println("Patas: " + this.patas);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ambiente: " + this.ambiente);
		System.out.println("Velocidade: " + this.velocidade + " m/s");
		System.out.println("------------------------------");
	}
}
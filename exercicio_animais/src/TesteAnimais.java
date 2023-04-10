package programasTeste;

public class TesteAnimais {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		Peixe tubarao = new Peixe();
		Mamifero urso_do_canada = new Mamifero();
		System.out.println("------------------------------");

		camelo.nome = "Camelo";
		camelo.cor = "Amarelo";
		camelo.ambiente = "Terra";
		camelo.comprimento = 150;
		camelo.velocidade = 2.0f;
		camelo.patas = 4;
		camelo.dados();		
		
		tubarao.nome = "Tubarão";
		tubarao.cor = "Cinzento";
		tubarao.ambiente = "Mar";
		tubarao.comprimento = 300;
		tubarao.velocidade = 1.5f;
		tubarao.patas = 0;
		tubarao.caracteristica = "Barbatanas e cauda";
		tubarao.dados();

		urso_do_canada.nome = "Urso-do-canadá";
		urso_do_canada.cor = "Vermelho";
		urso_do_canada.ambiente = "Terra";
		urso_do_canada.comprimento = 180;
		urso_do_canada.velocidade = 0.5f;
		urso_do_canada.patas = 4;
		urso_do_canada.dados();
	}

}

package modelo;

public class Guerreiro extends Heroi {
	
	private final String arma_ataque = "espada";
	private final String classe = "Gurreiro";
	
	public Guerreiro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void atacar(Heroi inimigo) {
		System.out.println("O " + this.getClasse() + " atacou usando " + this.getArma_ataque());
		this.atacarHeroi(inimigo);
	}

	public String getArma_ataque() {
		return arma_ataque;
	}

	public String getClasse() {
		return classe;
	}
	
	

}

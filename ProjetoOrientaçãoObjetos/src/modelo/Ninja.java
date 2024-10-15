package modelo;

public class Ninja extends Heroi {

	private final String arma_ataque = "shuriken";
	private final String classe = "Ninja";
	
	public Ninja(String nome, int idade) {
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

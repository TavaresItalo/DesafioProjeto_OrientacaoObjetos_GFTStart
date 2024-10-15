package modelo;

public class Mago extends Heroi {
	private final String arma_ataque = "magia";
	private final String classe = "Mago";
	
	public Mago(String nome, int idade) {
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

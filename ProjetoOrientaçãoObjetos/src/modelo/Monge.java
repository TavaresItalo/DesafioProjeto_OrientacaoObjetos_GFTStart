package modelo;

public class Monge extends Heroi {
	
	public Monge(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	private final String arma_ataque = "artes marciais";
	private final String classe = "Monge";
	
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

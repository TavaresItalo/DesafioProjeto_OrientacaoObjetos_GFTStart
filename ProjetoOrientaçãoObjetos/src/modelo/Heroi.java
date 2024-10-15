package modelo;

public class Heroi {
	
	private String nome;
	private int idade;
	private int vida;
	private int ataque;
	
	public Heroi(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.vida = 1000;
		this.ataque = 50;
	}
	
	public void atacarHeroi(Heroi inimigo) {
		inimigo.setVida(inimigo.getVida() - this.ataque);
		
		System.out.println(this.getNome() + " atacou " + inimigo.getNome());
		
		System.out.println("O inimigo " + inimigo.getNome() + " sofreu dano de "
		+ this.getAtaque() + " pontos");
		
		System.out.println(inimigo.getNome() + " está com " + inimigo.getVida() + " pontos de vida");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	

	
	
	
	
	
}

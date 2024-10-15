package modelo;

public class Main {
	public static void main(String[] args) {
		
		Ninja ninja = new Ninja("Jackie Chan", 24);
		Mago mago = new Mago("Gandalf", 300);
		Guerreiro guerreiro = new Guerreiro("Aragorn", 50);
		Monge monge = new Monge("Ang", 1500);
		
		monge.atacar(guerreiro);
		guerreiro.atacar(ninja);
		ninja.atacar(mago);
		mago.atacar(monge);
	}
}

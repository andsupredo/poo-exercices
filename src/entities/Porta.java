package entities;

public class Porta {

	public boolean estaAberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	public Porta (boolean estaAberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.estaAberta = estaAberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	
	public boolean abre() {
		if (this.estaAberta == true) {
			System.out.println("A porta já está aberta!");
		}
		else {
			System.out.println("Abrindo porta...");
		}
		return this.estaAberta = true;
	}
	
	public boolean fecha () {
		if (this.estaAberta == false) {
			System.out.println("A porta já está fechada!");
		}
		else {
			System.out.println("Fechando porta...");
		}
		return this.estaAberta = false;
	}
	
	public String pinta(String cor) {
		System.out.println("pintando porta de " + cor + "...");
		return cor;
	}
	
	public String estaAberta() {
		if (this.estaAberta == true) {
			return "A porta está aberta!";
		}
		else {
			return "A porta está fechada!";
		}
	}
}

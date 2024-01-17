package entidades;

public abstract class Moeda {
	public double valor;
	
	public abstract String info();
	public abstract double converter();
}

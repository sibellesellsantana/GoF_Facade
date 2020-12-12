package GoFReutilizaveis;

public class Estadia {
	double valorEstadia;
	int n;
	double totalEstadia=0;
	
	public Estadia () {
	}
	
	public Estadia (int noites, double estadia) {
		this.n = noites;
		this.valorEstadia = estadia;
	}
	
	public void valorTotalEstadia(){
		valorEstadia = n*valorEstadia;
	}
	
	public double getValorTotalEstadia() {
		return totalEstadia;
	}
}

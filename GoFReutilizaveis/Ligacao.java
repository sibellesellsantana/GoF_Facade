package GoFReutilizaveis;

public class Ligacao {
	double valorLigacao[] = new double[20];
	int i, q;
	double ligacao;
	
	public void quantidadeLigacao (int quantidade ) {
		this.q = quantidade;
	}
	
	public void guardaVetor(double l, int indice) {
		this.ligacao = l;
		this.i = indice;
		 valorLigacao[i]=l;
	
	}
	
	public double valorTotalLigacao() {
		double totalLigacao = 0;
		for (i=0; i<q; i++)
			totalLigacao +=valorLigacao[i];
		return totalLigacao;
	}
}

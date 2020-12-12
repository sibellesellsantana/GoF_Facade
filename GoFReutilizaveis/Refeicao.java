package GoFReutilizaveis;

public class Refeicao {
	double valorRefeicao[] = new double[20];
	double refeicao;
	int i, q;
	
	public void quantidadeRefeicao (int quantidade) {
		this.q = quantidade;
	}
	
	public void guardaVetor(double r, int indice) {
	this.refeicao = r;
	this.i = indice;
	valorRefeicao[i] = r; 
	}
	
	public double valorTotalRefeicao() {
		double totalRefeicao = 0;
		for (i=0; i<q; i++)
			totalRefeicao +=valorRefeicao[i];
		return totalRefeicao;
	}
	
}
package GoFReutilizaveis;

public class HospedagemFacade {
	double totalRefeicao;
	double totalLigacao;
	double totalEstadia;
	double imposto;
	
	public HospedagemFacade(double e, double l, double r, double i) {
		this.totalEstadia = e;
		this.totalLigacao = l;
		this.totalRefeicao = r;
		this.imposto = i;
	}
	
	public double valorTotalHospedagem() {
		double valor;
		valor = totalEstadia + totalLigacao + totalRefeicao + imposto;
		valor = valor + (imposto/100*valor);
		return valor;
		
	}
	
}

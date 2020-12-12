package GoFReutilizaveis;
import java.util.Scanner;

public class EntradaDados {
	 
	public void coletaDados() {
		
		int quantidade, cont = 0;
		Refeicao refeicao = new Refeicao();
		Ligacao ligacao = new Ligacao();
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o nome do h�spede: ");
		String nome = in.nextLine();
		Hospede hospede = new Hospede(nome);
		System.out.println("Digite o n�mero de refei��es: ");
		quantidade = in.nextInt();
		refeicao.quantidadeRefeicao(quantidade);
		while (quantidade >0) {
			System.out.println("Digite o valor da refeicao");
			double r = in.nextDouble();
			refeicao.guardaVetor(r, cont);
			quantidade --;
			cont ++;
		}
		refeicao.valorTotalRefeicao();
		System.out.println("Digite o n�mero de liga��es: ");
		quantidade = in.nextInt();
		ligacao.quantidadeLigacao(quantidade);
		while (quantidade > 0) {
			System.out.println("Digite o valor da ligacao");
			double l = in.nextDouble();
			ligacao.guardaVetor(l, cont);
			quantidade --;
			cont ++;
		}
		ligacao.valorTotalLigacao();
		System.out.println("Digite o n�mero de noites: ");
		int noites = in.nextInt();
		System.out.println("Digite o valor da estadia: ");
		double e = in.nextDouble();
		Estadia estadia = new Estadia (noites,e);
		estadia.valorTotalEstadia();
		System.out.println("Digite o valor do imposto: ");
		double i = in.nextDouble();
		Imposto imposto = new Imposto(i);
		
		HospedagemFacade hfacade = new HospedagemFacade(estadia.getValorTotalEstadia(), ligacao.valorTotalLigacao(), refeicao.valorTotalRefeicao(), imposto.getImposto());
		
		System.out.printf("Valor da hospedagem do h�spede %s � %.2f", hospede.getNome(), hfacade.valorTotalHospedagem());
		

	}
		
}

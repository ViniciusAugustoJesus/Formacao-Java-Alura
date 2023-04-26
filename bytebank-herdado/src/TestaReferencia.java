
public class TestaReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(5000);
	
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		
		
		

	}

}

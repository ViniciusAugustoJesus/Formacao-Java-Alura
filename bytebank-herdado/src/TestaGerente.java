
public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Jorge");
		g1.setCpf("124.448.457-22");
		g1.setSalario(2000);
		
		System.out.println(g1.getNome());
		
		g1.setSenha(2222);
		System.out.println(g1.autentica(2222));
		
		System.out.println(g1.getBonificacao());
	}
}

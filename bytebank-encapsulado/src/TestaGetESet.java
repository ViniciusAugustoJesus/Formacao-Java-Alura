
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2268);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente vinicius = new Cliente();
		vinicius.setNome("Vinicius");
		
		conta.setTitular(vinicius);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
	}
}

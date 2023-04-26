
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario vini = new Gerente();
		vini.setNome("Vinicius");
		vini.setCpf("144.158.548-22");
		vini.setSalario(1450);
		
		System.out.println(vini.getBonificacao());
		System.out.println(vini.getNome());

	}

}

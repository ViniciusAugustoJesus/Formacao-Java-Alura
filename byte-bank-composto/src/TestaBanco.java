
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente vini = new Cliente();
		vini.nome = "Vinicius";
		vini.cpf = "123.456.789-98";
		vini.profissao = "programador";
		
		Conta contaDoVini = new Conta();
		contaDoVini.titular = vini;
		
		System.out.println(contaDoVini.titular);
	}
}

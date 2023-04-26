
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2668);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337, 2668);
		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumero());
		
		System.out.println(Conta.getTotal());
	}
}

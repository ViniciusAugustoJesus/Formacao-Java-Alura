
public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 430;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.depositar(100);
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		segundaConta.sacar(50);
		
		primeiraConta.tranferir(50, segundaConta);
		
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
	}
}


public class Adm extends Funcionario implements Autenticavel {

	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Adm() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return 55;
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}

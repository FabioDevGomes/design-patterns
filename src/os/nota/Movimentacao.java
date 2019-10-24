package os.nota;

abstract class Movimentacao {
	private String nome;
	
	public Movimentacao(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}

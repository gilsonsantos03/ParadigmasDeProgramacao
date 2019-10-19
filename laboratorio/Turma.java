package br.ufma.ecp.paradigmas.laboratorio;

public class Turma {
	private int periodo, serie;
	private String tipoEnsino, sigla;
	
	public Turma(int periodo, int serie, String tipoEnsino, String sigla) {
		super();
		this.periodo = periodo;
		this.serie = serie;
		this.tipoEnsino = tipoEnsino;
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "Turma [periodo=" + periodo + ", serie=" + serie + ", tipoEnsino=" + tipoEnsino + ", sigla=" + sigla
				+ "]";
	}
	
	
}

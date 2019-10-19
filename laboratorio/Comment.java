package br.ufma.ecp.paradigmas.laboratorio;

public class Comment {

	private String idComment;
	private String comentario;

	public Comment(String idComment, String comentario) {
		this.idComment = idComment;
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Comment [idComment=" + idComment + ", comentario=" + comentario + "]";
	}

	public String getIdComment() {
		return idComment;
	}

	public void setIdComment(String idComment) {
		this.idComment = idComment;
	}
	
}

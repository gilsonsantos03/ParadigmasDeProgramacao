package br.ufma.ecp.paradigmas.laboratorio;

import java.util.LinkedList;
import java.util.List;

public class Post {

	private String idPost;
	private String postText;
	private List<Comment> comments;
	private List<String> likes;

	public Post(String idPost, String postText) {
		this.idPost = idPost;
		this.postText = postText;
		comments = new LinkedList<Comment>();
		likes = new LinkedList<String>();
	}
	
	public void addComment(Comment c) {
		comments.add(c);
	}

	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", postText=" + postText + "]";
	}

	public String getIdPost() {
		return idPost;
	}

	public void setIdPost(String idPost) {
		this.idPost = idPost;
	}
	public void printComentarios() {
		for (Comment c : comments) {
			System.out.println(c);
		}
	}
	public void addLike(String idcurtidor) {
		likes.add(idcurtidor);
	}
	public int qtdLikes() { return likes.size();}
	
}

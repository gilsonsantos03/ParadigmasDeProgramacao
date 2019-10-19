package br.ufma.ecp.paradigmas.lab1;

import java.util.LinkedList;
import java.util.List;

public class User {
	private String id, nome;
	private List<User> amigos;
	public List<Post> posts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public User(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		amigos = new LinkedList<User>();
		posts = new LinkedList<Post>();
	}
	
	//ele está inserindo uma id e passando pra variável nome, um nome vazio
	public User(String id) {
		this(id,  "");
	}
	
	public void addFriend(User u) {
		amigos.add(u);
	}
	public void addPost(Post p) {
		posts.add(p);
	}
	public void printPosts() {
		for (Post p : posts) {
			System.out.println(p);
		}
	}
	public void Likes() {
		for (Post p : posts) {
			System.out.println("O post " + p + " possui " + p.qtdLikes() + " likes");
		}
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + "]";
	}

	//AULA DIA 9
	
	@Override
	public boolean equals (Object o) {
		if (o instanceof User) {
		User oUser = (User)o;
		return this.getId() == oUser.getId();
		}else {
			return false;
		}
	}
}

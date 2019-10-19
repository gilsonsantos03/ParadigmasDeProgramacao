package br.ufma.ecp.paradigmas.lab1;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
	List<User> usuarios;
	
	public SocialNetwork() {
		usuarios = new ArrayList<User>(); // inicializamos para evitar um erro
		//experimentar rodar o código sem isso
	}
	public void addUser(User u) {
		usuarios.add(u);
	}
	public void printUsuarios() {
		for (User u : usuarios) {
			System.out.println(u);
		}
	}
	
	
	public void addFriendly(String iduser1, String iduser2) {
		User user1 = null;
		User user2 = null;
		for (User u : usuarios) {
			if (u.getId() == iduser1) {
				user1 = u;
			}
			if (u.getId() == iduser2) {
				user2 = u;
			}
			if (user1 != null && user2 != null) {
				break;
			}
		}
		if (user1 != null && user2 != null) {
			user1.addFriend(user2);
			user2.addFriend(user1);
		}else {
			System.out.println("Pelo menos uma id de usuário não foi encontrada");
		}
	}
	public void addPost(String iduser, Post post) {
		for (User u : usuarios) {
			if (u.getId() == iduser) {
				u.addPost(post);
			}
		}
		
	}

	public void liked(String idcurtidor, String idcurtido, String idpost) {
		User user1 = null, user2 = null;
		for (User u : usuarios) {
			if (u.getId() == idcurtidor) {
				user1 = u;
			}
			if (u.getId() == idcurtido) {
				user2 = u;
			}
			if (user1 != null && user2 != null) {
				//System.out.println("usuários encontrados");
				break;
			}
		}
		for(Post p : user2.posts) {
			if (p.getIdPost() == idpost) {
				p.addLike(idcurtidor);
				//System.out.println("o like foi adicionado");
			}if (p != null) {break;}
		}
	}
	
	public void printUpdates() {
		System.out.println("----------");
		for (User u : usuarios) {
			System.out.println(u);
			//System.out.println("-----Posts-----");
			u.printPosts();
			u.Likes();
			for (Post p : u.posts) {
				p.printComentarios();
				
			}
			System.out.println("");
		}
	}

	public void addComment(String iduser1, String iduser2, String idpost2, Comment c1) {
		User user1 = null, user2 = null;
		for (User u : usuarios) {
			if (u.getId() == iduser1) {
				user1 = u;
			}
			if (u.getId() == iduser2) {
				user2 = u;
			}
			if (user1 != null && user2 != null) {
				break;
			}
		}
		for (Post p1 : user2.posts) {
			if (p1.getIdPost() == idpost2) {
				p1.addComment(c1);
			}
			if(p1 != null) {
				break;
			}
		}
	}

	
	//aula do dia 9
		public void addFriendly2(String iduser1, String iduser2) {
			int idx1 = usuarios.indexOf(new User(iduser1));
			int idx2 = usuarios.indexOf(new User(iduser2));
			//tivemos que sobrescrever o equals na classe usuário
			if (idx1 != -1 && idx2 != -1) {
				usuarios.get(idx1).addFriend(usuarios.get(idx2));
			}else {
				System.out.println("Pelo menos um usuário não foi encontrado!");
			}
			
		}
		
		

}

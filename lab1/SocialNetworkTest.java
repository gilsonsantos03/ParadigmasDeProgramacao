package br.ufma.ecp.paradigmas.lab1;

public class SocialNetworkTest {

	public static void main(String[] args) {
		
		SocialNetworkMap rede = new SocialNetworkMap();
		rede.addUser (new User ("u1", "Joao Carlos") );
		rede.addUser (new User ("u2", "Maria Antonia") );
		rede.addUser (new User ("u3", "Emanuel Benedito") );
		rede.addUser (new User ("u4", "Josefina de Almeida") );
		
		rede.addFriendly2("u3", "u8");
		
		/*
		rede.addFriendly ("u1", "u2");
		rede.addFriendly ("u1", "u3");
		rede.addFriendly ("u2", "u4");
		
		rede.addPost ("u1", new Post ("p1", "Tomando cafe"));
		rede.addPost ("u2", new Post ("p2", "amizade é tudo de bom ") );
		rede.addPost ("u2", new Post ("p3", "passeando com meu cachorro"));
		
		rede.liked ("u4", "u2", "p2"); 
		rede.addComment("u2", "u1", "p1", new Comment ("c2", "Com pão de queijo ? tudo di bao"));
		
		rede.printUpdates();
		*/
	}

}

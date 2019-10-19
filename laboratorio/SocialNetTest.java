package br.ufma.ecp.paradigmas.laboratorio;

public class SocialNetTest {

	public static void main(String[] args) {
		SocialNetwork rede = new SocialNetwork ();

		rede.addUser (new User ("u1", "Joao Carlos") );
		System.out.println(rede.usuarios.get(0));
		
	}

}

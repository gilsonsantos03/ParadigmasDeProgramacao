package br.ufma.ecp.paradigmas.lab1;

import java.util.HashMap;
import java.util.Map;

public class SocialNetworkMap {
	
	private Map<String, User> users = new HashMap<String, User>();
	
	public void addUser(User user) {
		users.put(user.getId(), user);
	}
	
	public void addFriendly2(String iduser1, String iduser2) {
		User u1 = users.get(iduser1);
		User u2 = users.get(iduser2);
		if (u1 != null && u2 != null) {
			u1.addFriend(u2);
			u2.addFriend(u1);
		}else {
			System.out.println("Pelo menos um usuário não foi encontrado!");
		}
		
	}
	
}

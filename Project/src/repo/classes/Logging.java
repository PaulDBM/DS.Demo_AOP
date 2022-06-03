package repo.classes;

import java.util.HashMap;
import java.util.Map;

public class Logging {
	
	private Map<String, String> users = new HashMap<String, String>();
	
	public Logging() {
		this.createUsers();
	}
	
	private void createUsers() {
		this.users.put("pauldbm", "ur%&22");
		this.users.put("pedromm", "qa1aqa");
		this.users.put("santiagosq", "cosie0");
	}
	
	public void init() {
		boolean validUser;
		do {
			System.out.print("Ingrese su nombre de usuario: ");
			String userName = Messages.readNext();
			System.out.print("Ingrese su clave de acceso: ");
			String password = Messages.readNext();
			validUser = this.logIn(userName, password);
		} while (!validUser);
	}
	
	public boolean logIn(String userName, String password) {
		String userSecret = users.get(userName);
		
		if (!userSecret.equals(password)) {
			return false;
		}
		
		return true;
	}

}

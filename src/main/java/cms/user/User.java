package cms.user;

public abstract class User {
	private final int ID;
	private final String nome;
	private final String email;
	private final String password;
	
	public User(int ID, String nome, String email, String password) {
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public boolean checkPassword(String p) { 
		return password.equals(p);
	}

	public int getId() {
		return ID;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	
}

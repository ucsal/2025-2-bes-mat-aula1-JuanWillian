package cms.user;

public abstract class User {
	private long id;
	private String nome;
	private String email;
	private String password;
	
	public boolean checkPassword(String password) { 
		return password.equals(this.password) ? true : false;
	}

	public long getId() {
		return id;
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

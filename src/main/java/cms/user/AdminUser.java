package cms.user;

public class AdminUser extends User{
	private final int ID;
	private String nome;
	private String email;
	private String password;

	public AdminUser(int ID, String nome, String email, String password) {
		super(ID, nome, email, password);
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}

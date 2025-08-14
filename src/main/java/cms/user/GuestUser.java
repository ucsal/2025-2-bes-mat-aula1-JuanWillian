package cms.user;

public class GuestUser extends User{
	private final int ID;
	private String nome;
	private String email;
	private String password;

	public GuestUser(int ID, String nome, String email, String password) {
		super(ID, nome, email, password);
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}

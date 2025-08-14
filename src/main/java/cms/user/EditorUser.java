package cms.user;

public class EditorUser extends User{
	private final int ID;
	private final String nome;
	private final String email;
	private final String password;

	public EditorUser(int ID, String nome, String email, String password) {
		super(ID, nome, email, password);
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}

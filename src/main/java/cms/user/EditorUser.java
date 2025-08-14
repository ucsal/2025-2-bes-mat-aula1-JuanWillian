package cms.user;

public class EditorUser extends User{

	public EditorUser(int ID, String nome, String email, String password) {
		super(ID, nome, email, password);
	}

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}

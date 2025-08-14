package cms.user;

public class GuestUser extends User{

	public GuestUser(int ID, String nome, String email, String password) {
		super(ID, nome, email, password);
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}

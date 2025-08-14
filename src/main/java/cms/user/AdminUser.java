package cms.user;

public class AdminUser extends User{

	public AdminUser(int ID, String nome, String email, String password) {
		super(ID, nome, email, password);
	}

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}

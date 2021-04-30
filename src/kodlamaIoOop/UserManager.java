package kodlamaIoOop;

public class UserManager {
	public void signUp(User user) {
		System.out.println("Aramýza Hoþgeldin " + user.getFirstName() + "!");

	}

	public void signIn(User user) {
		System.out.println("Tekrardan Hoþgeldin " + user.getFirstName() + "!");
	}

	public void delete(User user) {
		System.out.println("Sistemden kaydýnýz silinmiþtir: " + user.getFirstName());
	}
}

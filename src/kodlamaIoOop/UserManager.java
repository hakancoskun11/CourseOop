package kodlamaIoOop;

public class UserManager {
	public void signUp(User user) {
		System.out.println("Aram�za Ho�geldin " + user.getFirstName() + "!");

	}

	public void signIn(User user) {
		System.out.println("Tekrardan Ho�geldin " + user.getFirstName() + "!");
	}

	public void delete(User user) {
		System.out.println("Sistemden kayd�n�z silinmi�tir: " + user.getFirstName());
	}
}

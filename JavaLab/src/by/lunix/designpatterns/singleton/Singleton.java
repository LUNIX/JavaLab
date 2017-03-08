package by.lunix.designpatterns.singleton;
/**
 * ����� ������� �������
 * @author lunix
 *
 */
public class Singleton {
	private static Singleton instance;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}

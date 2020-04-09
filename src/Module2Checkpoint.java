import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Module2Checkpoint {
	/*
	 * JFrame JPanel JTextField
	 */
	private String name;

	void Name(String name) {
		this.name = name;
		if (name.equalsIgnoreCase("Michael")) {
			System.out.println("Awesome");
		} else {
			System.out.println("Lame");
		}
	}

	int shoes;
	String favicecream;
	boolean goingtodance;
	JButton button = new JButton();
	Cat Felix = new Cat();

}
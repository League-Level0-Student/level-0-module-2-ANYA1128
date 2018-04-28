import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog(null, "What is your height?" + " (in inches)");
		int num = Integer.parseInt(height);
		if (num >= 48) {
			JOptionPane.showMessageDialog(null, "You can go on " + "the Rollercoaster!");
		}
		if (num < 48) {
			JOptionPane.showMessageDialog(null, "You need to grow " + "more first!");
		}

	}
}

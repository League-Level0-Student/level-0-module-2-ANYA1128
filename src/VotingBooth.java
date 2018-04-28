import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "How old are you?" + " (in years)");
		int num = Integer.parseInt(age);
		if (num >= 18) {
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
		}
		if (num < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}

	}
}

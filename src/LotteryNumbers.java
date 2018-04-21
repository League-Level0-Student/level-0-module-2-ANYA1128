import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random gen = new Random ();
	int LotteryNumbers = gen.nextInt(10);
    String combined = "";
    for(int i=0;i<5;i++) {
    int x = gen.nextInt(10);
    combined = combined + " " + x;
    	
    	
}
    JOptionPane.showMessageDialog(null, "Lottery Numbers: " + 
combined);
}
}

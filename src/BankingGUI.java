import javax.swing.*;

public class BankingGUI {
	public static void main(String[] arg) {
JFrame frame = new JFrame();
     frame.setVisible(true);
     frame.setBounds(400, 150, 600, 500);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setTitle("Banking application");
     JLabel balance = new JLabel("New Balance = ");
     balance.setBounds(150, 150, 100, 100);
     frame.add(balance);
     JPanel panel = new JPanel();
     frame.getContentPane();
	}
}

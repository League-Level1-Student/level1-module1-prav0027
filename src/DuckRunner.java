import javax.swing.JOptionPane;

public class DuckRunner {
public static void main(String[] args) {
	Duck daffy = new Duck("Donuts","Daffy", 5);
	daffy.quack();
	daffy.introduction();
	String answer = JOptionPane.showInputDialog("Do you want to be Daffy's friend?");
	daffy.friends(answer);
}
}

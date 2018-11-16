import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	String userGuess = JOptionPane.showInputDialog("What is the code?");
	int guess = Integer.parseInt(userGuess);
	vault.tryCode(guess);
	vault.findCode();
}
}

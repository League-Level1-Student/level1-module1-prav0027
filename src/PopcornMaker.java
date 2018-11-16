import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor popcorn would you like to pop?");
	String time = JOptionPane.showInputDialog("How many minutes should the popcorn be popped?");
	int cookTime = Integer.parseInt(time);
	Popcorn popcorn = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(cookTime);
	microwave.startMicrowave();
	for(int i=0; i<20; i++) {
		popcorn.applyHeat();
		popcorn.eat();
	}
}
}

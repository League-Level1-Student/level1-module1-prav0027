import javax.swing.JOptionPane;

class Vault{
	private int num;
	int answer = 10;
	Vault(){
		
	}
	void tryCode(int num) {
		if(num==answer) {
		JOptionPane.showMessageDialog(null, "True.");
		}
		else {
		JOptionPane.showMessageDialog(null, "False.");	
		}
		this.num=num;
	}
	void findCode() {
		for (int i = 0; i < 1000000; i++) {
			if(i==answer) {
			System.out.println(i);	
			}
			else {
				System.out.println("-1");
			}
		}
	}
}


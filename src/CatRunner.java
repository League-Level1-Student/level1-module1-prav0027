
public class CatRunner {
public static void main(String[] args) {
	Cat cat = new Cat("joey");
	cat.meow();
	cat.printName();
	for(int i=0; i<9; i++) {
	cat.kill();
	}
}
}


class Duck {
private String favoriteFood;
private String name;
private Object numberOfFriends;

Duck(String favoriteFood, String name, int numberOfFriends){
	this.favoriteFood=favoriteFood;
	this.numberOfFriends=numberOfFriends;
	this.name=name;
}
void introduction() {
	System.out.println("Hello, my name is "+name+". I have "+numberOfFriends+" friends, but I am always looking for more! My favorite food is "+favoriteFood+".");
}
void quack() {
	System.out.println("QUACKKKKKKKKKKK");
}
void friends(String answer) {
if(answer.equalsIgnoreCase("yes")) {
	System.out.println("YAYYYY");
}
else if(answer.equalsIgnoreCase("no"))
	System.out.println(":(((((");
}
}

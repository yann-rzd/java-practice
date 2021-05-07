package heritagepolymorphisme;

public class Personne {
	
	private String firstName;
	private int age;
	
	public Personne(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void dormir() {
		System.out.println("Rrrrrrr Rrrrrrr");
	}
	
	public void manger(String fruit) {
		System.out.println("Miam miam, c’est bon ce fruit, " + fruit + " !");
	}
	
	public void bonjour() {
		System.out.println("Bonjour, tu es " + firstName + " et tu as " + age + " ans");
	}
	
	@Override
	public String toString() {
		return "Personne [firstName=" + firstName + ", age=" + age + "]";
	}
}

package abstraction.part1;
class Joshi{

   public void show(){
    System.out.println("Happy Coding");

   }
}
class Vamsi extends Joshi{
	public Vamsi() {
		System.out.println("Vamsi Constructor");
	}
	
}

public class Sample1 {
	public static void main(String[] args) {
		Vamsi v= new Vamsi();
	}

}

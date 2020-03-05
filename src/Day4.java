
public class Day4 {
	private int age;
	public Day4(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge<0){
              System.out.println("Age is not valid, setting age to 0.");
              this.age = 0;
          }else{
              this.age = initialAge;
          }
	}
	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String old = "You are old.";
        old = (this.age<13) ? "You are young." : old;
        old = (this.age<18&&13<=this.age) ? "You are a teenager." : old;
        System.out.println(old);
	}

	public void yearPasses() {
  		// Increment this person's age.
          this.age++;
	}
	public static void main(String[] args) {
		Day4 Person = new Day4(-1);
		Day4 Person2 = new Day4(12);
		Day4 Person3 = new Day4(20);
		
		Person.amIOld();
		Person.yearPasses();
		Person.yearPasses();
		Person.yearPasses();
		Person.amIOld();
		System.out.println(" ");
		
		Person2.amIOld();
		Person2.yearPasses();
		Person2.yearPasses();
		Person2.yearPasses();
		Person2.amIOld();
		System.out.println(" ");
		
		Person3.amIOld();
		Person3.yearPasses();
		Person3.yearPasses();
		Person3.yearPasses();
		Person3.amIOld();
		
	}

}

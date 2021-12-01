
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Wilder jeanClaude = new Wilder("Jean-Claude", true);
      Wilder anne = new Wilder("Anne", true);
      Wilder henri = new Wilder("Henri", false);
      
      System.out.println(anne.whoAmI());
      System.out.println(henri.whoAmI());
      System.out.println(jeanClaude.whoAmI());
	}
	
	

}

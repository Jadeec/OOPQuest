
public class Wilder {

		private String firstName; 
		private boolean aware; 
		
		public  Wilder(String firstName, boolean aware)  {
			this.firstName = firstName; 
			this.aware = aware; 
		}
	   //getters 
		public String getFirstName() {return this.firstName ;}
		public boolean isAware() {return this.aware;}
		
		//setters 
		public void setFirstName(String firstName) {
			this.firstName = firstName; 
		}
		
		public void setIsAware () {
			this.aware = !this.aware; 
		}
		
	
		
		//instance method
		public String whoAmI () {
			if (aware) {
				return "I'm"+ " "+ this.getFirstName()+ " "+"and i'm aware";
			} else  {
				return "I'm"+ " "+this.firstName + " "+"and i'm not aware";
				}
			}
			
}

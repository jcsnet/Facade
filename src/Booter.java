import domain.User;
import facade.DbFacade;


public class Booter {
	
	public static void main(String[] args) {
		
		DbFacade dbFacade = new DbFacade();
		
		try{
			
			System.out.println(dbFacade.getUserById(2));
			
			//ten b³¹d ³apie try-catch
			System.out.println(dbFacade.getUserById(3));
			
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("\nUser by this id do not exist!\n");
		}
		
		finally{
			User newUserToPersist = new User(3,"Adam","Nowak","79090524589","1979","USA", 
					"New York", "New York City", "Manhattan", true, false);
			
			dbFacade.persistUser(newUserToPersist);
			System.out.println(dbFacade.getUserById(3));
		}
	}
}

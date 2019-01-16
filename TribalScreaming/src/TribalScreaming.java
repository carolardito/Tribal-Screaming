
public class TribalScreaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(scream("Peter"));
	}
	
	public static String scream(String name) {
		String finalResult = " is amazing";
		
		if (name == null) {
			finalResult = "You" + finalResult;
		}
		else {
			finalResult = name + finalResult;
		}
		
		
		return finalResult;
		
		
	}

}
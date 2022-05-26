package Day7_2nd.Review.operator;

public class HomeWork7 {

	public static void main(String[] args) {
		
		
		String name = "Same";
		String message = name + " is eligible to vote?";
		String citizenship = "USA";
		boolean isEligible;

		if (citizenship == "USA") {
			isEligible = true;
		} else {
			isEligible = false;
		}
		System.out.println(message + "\n" + isEligible);


	}

}

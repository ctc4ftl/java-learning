import java.util.ArrayList;

public class Temperatures {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		
		weeklyTemperatures.add(80);
		weeklyTemperatures.add(81);
		weeklyTemperatures.add(82);
		weeklyTemperatures.add(83);

		//Insert a temperature.
		weeklyTemperatures.add(1,88);
		
		//Print the inserted temperature.
		//System.out.println( weeklyTemperatures.get(1) );
		
		//Iterate over the ArrayList.
		//for ( int i = 0; i < weeklyTemperatures.size(); i++ ) {
			
			//System.out.println( weeklyTemperatures.get(i) );
		
		//Use the concise.
		for ( Integer temperature : weeklyTemperatures ) {
			
			System.out.println( temperature );
			
		}
		
	}
	
}
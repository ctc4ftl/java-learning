public class Soccer {
	
	public static void main(String[] args) {
		
		char penaltyKick = 'A';
		switch(penaltyKick) {
		case 'A': System.out.println("Messi shoots and scores!");
		break;
		case 'B': System.out.println("Mess shoots and misses!");
		break;
		case 'C': System.out.println("Messi shoots but the keeper blocks it!");
		break;
		default: System.out.println("Messi went to Spain.");
		break;
		}
		
	}
	
}
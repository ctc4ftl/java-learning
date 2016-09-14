public class ScrumMath {
	
	public ScrumMath() {
		
		
		
	}
	
	public double ROI(double prof, double cost) {
		
		//Formula:
		//
		//    ROI = (prof - cost) / cost
		//
		//Where prof = profit from project,
		//		cost = cost of project;
		
		return ((prof-cost)/cost);
		
	}
	
	public double NPV(int I, int FV, double r, int n) {
		
		//Formula:
		//
		//    NPV = (FV/(1+r)^n) - I
		//
		//Where I = investment,
		//		FV = future value,
		//		r = discount rate,
		//		n = time periods;
		
		//See stackoverflow http://goo.gl/dGfQcd for info on using exponents.
		
		return (FV/(Math.pow((r+1),1))-I);
		
	}
	
	public double EMV(double imp, double prob) {
		
		//Formula:
		//
		//    EMV = imp * prob
		//
		//Where imp = risk impact (in dollars)
		//		prob = risk probability (as percentage)
		
		return(imp*prob);
		
	}
	
	public static void main(String[] args) {
		
		ScrumMath scrumCalc = new ScrumMath();
		System.out.println("Return on Investment: " + scrumCalc.ROI(100000, 75000));
		System.out.println("Net Present Value: " + scrumCalc.NPV(500,570,0.1,1));
		System.out.println("Estimated Monetary Value: " + scrumCalc.EMV(500, 0.1));
		
	}

}

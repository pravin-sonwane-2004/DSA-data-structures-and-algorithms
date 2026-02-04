package Math;

public class CompoundInterest {
	public static void main(String [] args) {
		double principle = 1000;
		double rateI = 9;
		double time = 2;
		double si = principle*Math.pow(1+rateI/100,time);
		double amount =  si-principle;
		System.out.println(amount);
	}
}
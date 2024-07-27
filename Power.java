
public class Power {

	public static int power(int base, int exponent){
		if(exponent == 1) {
			return base;
		}
		else {
			return base * power(base,exponent-1);
		}
	}
}

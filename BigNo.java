import java.math.BigInteger;

public class BigNo {
	public static void main(String s[]) {
		BigInteger pref = new BigInteger("1123111600000000000000") ;
		String suff = "1116";
		BigInteger no = new BigInteger(pref.toString()+suff+"00");
		BigInteger currHigh = new BigInteger(pref.toString()+suff+"99");
		BigInteger ninetySeven = new BigInteger("97");
		BigInteger mod = no.mod(ninetySeven);
		no = no.subtract(mod).add(ninetySeven);
		BigInteger highNo = new BigInteger("1123111999999999999999111699");
		while(no.compareTo(highNo)==-1) {
			if(no.compareTo(currHigh)==1) {
				pref = pref.add(new BigInteger("1"));
				no = new BigInteger(pref.toString()+suff+"00");
				currHigh = new BigInteger(pref.toString()+suff+"99");
				mod = no.mod(ninetySeven);
				no = no.subtract(mod).add(ninetySeven);;
			}
			System.out.println(no);
			no = no.add(ninetySeven);
		}
		
		
	}
}

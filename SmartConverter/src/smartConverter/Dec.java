package smartConverter;

public class Dec extends Broj{

	private String dec;
	
	public Dec() {
		
	}
	
	public boolean check(String dec) {

		boolean check = true;
		
		for(int i = 0; i< dec.length(); i++) {
			if(dec.charAt(0) == '-' || dec.charAt(i) == '0' || dec.charAt(i) == '1' || dec.charAt(i) == '2' || dec.charAt(i) == '3' || dec.charAt(i) == '4' 
			|| dec.charAt(i) == '5'|| dec.charAt(i) == '6' || dec.charAt(i) == '7' || dec.charAt(i) == '8' || dec.charAt(i) == '9') {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		return check;
	}
	
	public boolean maxNum(String dec) {
		
		int br = Integer.parseInt(dec, 10);
		
		if(br > Integer.MAX_VALUE) {
			return false;
		}else {
			return true;
		}
		
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}
	
	
	
}

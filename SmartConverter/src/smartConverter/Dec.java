package smartConverter;

public class Dec extends Broj{

	private String dec;
	
	public Dec() {
		
	}
	
	public boolean check(String dec) {

		boolean check = true;
		
		for(int i = 0; i< dec.length(); i++) {
			if(dec.charAt(0) == '-' || dec.charAt(i) >= '0' && dec.charAt(i) <= '9') {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		return check;
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}
	
	
	
}

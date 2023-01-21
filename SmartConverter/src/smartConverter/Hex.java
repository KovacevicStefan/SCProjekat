package smartConverter;

public class Hex extends Broj{

	public String hex;
	
	public Hex() {
		
	}
	
	public boolean check(String hex) {
		
		boolean check = true;
		
	    for(int i = 0; i<hex.length(); i++) {
	    	    	
	    	char br = hex.charAt(i);
	    	
	    	if((br < '0' || br > '9') && (br < 'A' || br > 'F') && (br < 'a' || br > 'f')) {
	    		check = false;
	    	}else {
	    		check = true;
	    	}    	
	    }
	    return check;
	}
	
	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}
	
	
	
}

package smartConverter;

public class Bin extends Broj{

	private String bin;
	
	public Bin() {
		
	}
	
	public boolean check(String bin) {
		
		boolean check = true;
		
		for(int i = 0; i< bin.length(); i++) {
			if(bin.charAt(i) == '0' || bin.charAt(i) == '1') {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		return check;
	}

	public boolean maxNum(String bin) {
		
		int br = Integer.parseInt(bin, 2);
		
		if(br > Integer.MAX_VALUE) {
			return false;
		}else {
			return true;
		}
	}
	
	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}
		
	
	
}

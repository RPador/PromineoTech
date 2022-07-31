


public class AsteriskLogger {

	
	private String word;






public void AsteriskLog(String word) {
	System.out.println("***" + word + "***");
	this.word = word;
	
}

public void AsteriskError(String word) {
	System.out.println("**************" + "\n***ERROR: " + word + "***" + "\n*************");
	this.word = word;
}


public String getWord() {
	return word;
}


public void setWord(String word) {
	this.word = word;
}
	

}

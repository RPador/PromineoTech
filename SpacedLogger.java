
public class SpacedLogger {

	
	private String word;
	
	
public void SpacedLog(String word) {
	this.word = word;
	
		System.out.println(word.replaceAll("\\B|\\b", " "));
	 return;
}
	
public void SpacedError(String word) {
	this.word = word;
		System.out.println("ERROR:" + word.replaceAll("\\B|\\b", " ") + "\n");
}
	
}

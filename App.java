

public class App implements Logger {
	

	
	

	public static void main(String[] args) {
	
		AsteriskLogger a = new AsteriskLogger();
		SpacedLogger b = new SpacedLogger();
		a.AsteriskLog("My name is Ranon");
		a.AsteriskError("My name is Ranon");
		b.SpacedLog("My name is Ranon");
		b.SpacedError("My name is Ranon");


		
		
		
	}

	
}

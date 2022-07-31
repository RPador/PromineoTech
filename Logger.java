

public interface Logger {


	
public default void Log(String w) {
	AsteriskLogger word = new AsteriskLogger();
}

public default void Error(String w) {
	SpacedLogger word = new SpacedLogger();
}
	
}

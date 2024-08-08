package aug8th;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException()
	{
		super("your age is not yet 18 , Not Elegible for voting ..");
	}

}

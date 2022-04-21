package chain_of_responsibility.implementation_1.exceptions;

public class AuthorizationException extends RuntimeException {
    public AuthorizationException (String message) {
        super("AuthorizationException: " + message);
    }
}

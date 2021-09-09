package co.com.rappi.certificacion.calculadora.exceptions;

public class IncorrectResultOfSubtractionException extends AssertionError {
    public static final String INCORRECT_RESULT_OF_SUBTRACTION_WITH_ZERO_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE SUBTRACTION IS INCORRECT, WHEN A NUMBER IS SUBTRACTED WITH ZERO THE RESULT MUST BE THE SAME NUMBER";
    public static final String INCORRECT_RESULT_OF_SUBTRACTION_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE SUBTRACTION IS INCORRECT";

    public IncorrectResultOfSubtractionException(String message, Throwable cause){
        super(message, cause);
    }
}

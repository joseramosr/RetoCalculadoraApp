package co.com.rappi.certificacion.calculadora.exceptions;

public class IncorrectResultOfMultiplicationException extends AssertionError {
    public static final String INCORRECT_RESULT_OF_MULTIPLICATION_WITH_ZERO_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE MULTIPLICATION IS INCORRECT, WHEN A NUMBER IS MULTIPLIED BY ZERO THE RESULT MUST BE ZERO";
    public static final String INCORRECT_RESULT_OF_MULTIPLICATION_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE MULTIPLICATION IS INCORRECT";

    public IncorrectResultOfMultiplicationException(String message, Throwable cause){
        super(message, cause);
    }
}

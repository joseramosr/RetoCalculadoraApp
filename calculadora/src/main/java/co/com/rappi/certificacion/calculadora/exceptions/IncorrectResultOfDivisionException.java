package co.com.rappi.certificacion.calculadora.exceptions;

public class IncorrectResultOfDivisionException extends AssertionError {
    public static final String INCORRECT_RESULT_OF_DIVISION_WITH_ZERO_MESSAGE_EXCEPTION = "ERROR WHEN DIVIDING BY ZERO";
    public static final String INCORRECT_RESULT_OF_DIVISION_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE DIVISION IS INCORRECT";

    public IncorrectResultOfDivisionException(String message, Throwable cause){
        super(message, cause);
    }
}

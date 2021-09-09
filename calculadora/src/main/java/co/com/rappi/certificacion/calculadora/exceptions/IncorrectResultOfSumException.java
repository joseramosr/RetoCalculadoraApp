package co.com.rappi.certificacion.calculadora.exceptions;

public class IncorrectResultOfSumException extends AssertionError {
    public static final String INCORRECT_RESULT_OF_SUM_WITH_ZERO_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE SUM IS INCORRECT, WHEN ADD A NUMBER WITH ZERO THE RESULT MUST BE THE SAME NUMBER";
    public static final String INCORRECT_RESULT_OF_SUM_MESSAGE_EXCEPTION = "ERROR, THE RESULT OF THE SUM IS INCORRECT";

    public IncorrectResultOfSumException(String message, Throwable cause){
        super(message, cause);
    }
}

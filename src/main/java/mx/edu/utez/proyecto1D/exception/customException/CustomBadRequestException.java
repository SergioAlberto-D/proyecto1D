package mx.edu.utez.proyecto1D.exception.customException;

public class CustomBadRequestException extends RuntimeException{
    public CustomBadRequestException(String mensaje){
        super(mensaje);
    }
}

package exceptions;

import enums.ERROR_CODE;

public class ExcecaoNegocio extends RuntimeException {
    private final ERROR_CODE codigo;

    public ExcecaoNegocio(ERROR_CODE code, String message) {
        super(message);
        this.codigo = code;
    }
}

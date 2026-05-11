package exceptions;

import enums.ERROR_CODE;

public class EncomendaNaoEncontrada extends ExcecaoNegocio{
    public EncomendaNaoEncontrada() {
        super(ERROR_CODE.ENCOMENDA_NAO_ENCONTRADA, "Sua encomenda nao foi encontrada! ");
    }
}

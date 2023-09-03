package uniderp.loo.estagio.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns {
    protected LocalDate data ;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BaseDadosComuns(LocalDate data) {
        this.data = data;
    }

    
}

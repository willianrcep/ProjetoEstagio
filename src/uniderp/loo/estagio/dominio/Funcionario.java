package uniderp.loo.estagio.dominio;

public class Funcionario {
    
    private String cracha;
    private String contaCorrente;
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public Funcionario(String cracha, String contaCorrente) {
        this.cracha = cracha;
        this.contaCorrente = contaCorrente;
    }

    
}

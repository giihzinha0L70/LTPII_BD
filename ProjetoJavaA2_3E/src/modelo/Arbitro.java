package modelo;

public class Arbitro extends Pessoa{
    
    private String certificado;
    private Jogo jogo;

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    public Arbitro(String nome, int idade, String certificado, Jogo jogo){
        super(nome, idade);
        this.certificado=certificado;
        this.jogo=jogo;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nCertificado" + getCertificado()+
                "\n--- Dados de Jogo ---" + getJogo();
    }
}

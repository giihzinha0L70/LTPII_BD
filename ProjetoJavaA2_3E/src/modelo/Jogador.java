package modelo;

public class Jogador extends Pessoa{
    
    private String posicao;
    private Estatisticas estatisticas;
    private Time time;

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Estatisticas getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(Estatisticas estatisticas) {
        this.estatisticas = estatisticas;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public Jogador(String nome, int idade, String posicao, Estatisticas estatisticas, Time time){
        super(nome, idade);
        this.posicao=posicao;
        this.estatisticas=estatisticas;
        this.time=time;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nPosição" + getPosicao()+
                "\n--- Dados das Estatísticas ---" + getEstatisticas()+
                "\n--- Dados do Time ---" + getTime();
    }
    
}

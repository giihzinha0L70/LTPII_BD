package modelo;

public class Estatisticas {
    private int pontos;
    private int assistencias;
    private int rebotes;
    private Jogo jogo;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    public Estatisticas(int pontos, int assistencias, int rebotes, Jogo jogo){
        this.pontos=pontos;
        this.assistencias=assistencias;
        this.rebotes=rebotes;
        this.jogo=jogo;
    }
    
    @Override
    public String toString(){
        return  "\nPontos:" + getPontos()+
                "\nAssistências:" + getAssistencias()+
                "\nRebotes:" + getRebotes()+
                "\n--- Dados de Jogo ---" + getJogo();
    }
}

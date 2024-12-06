package modelo;

public class Treinador extends Pessoa{
    private int experiencia;
    private Time time;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public Treinador(String nome, int idade, int experiencia, Time time){
        super(nome, idade);
        this.experiencia=experiencia;
        this.time=time;        
    }
    
    @Override
    public String toString(){
        return  "\nNome:" + getNome()+
                "\nIdade:" + getIdade()+
                "\nExperiência:" + getExperiencia()+
                "\n--- Dados de Time ---" + getTime();
    }
}

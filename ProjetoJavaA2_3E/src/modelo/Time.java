package modelo;

public class Time {
    private String nome;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public Time(String nome, String cidade){
        this.nome=nome;
        this.cidade=cidade;
    }
    
    @Override
    public String toString(){
        return  "\nNome:" + getNome()+
                "\nCidade:" + getCidade();
    }
}

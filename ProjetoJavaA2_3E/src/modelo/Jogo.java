package modelo;

public class Jogo {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Jogo(String data){
        this.data=data;
    }
    
    @Override
    public String toString(){
        return  "\nData:" + getData();
    }
}

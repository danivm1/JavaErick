package t05.exe04;

public class Bicicleta {
    private int maxMarcha;
    private int atualMarcha;

    public Bicicleta(){
        this.maxMarcha = 18;
        this.atualMarcha = 0;
    }

    public Bicicleta(int maxMarcha){
        this.maxMarcha = maxMarcha;
        this.atualMarcha = 0;
    }

    public int getMaxMarcha(){
        return this.maxMarcha;
    }

    public void setMaxMarcha(int marcha){
        this.maxMarcha = marcha;
    }
    
    public int getAtualMarcha(){
        return this.atualMarcha;
    }

    public void setAtualMarcha(int atual){
        this.atualMarcha = atual;
    }

    public String aumentaMarcha(){
        if(this.atualMarcha < this.maxMarcha){
            this.atualMarcha++;
            return "Marcha aumentada";
        }else{
            return "Marcha máxima ja alcancada";
        }
    }

    public String diminuiMarcha(){
        if(this.atualMarcha > 0){
            this.atualMarcha--;
            return "Marcha diminuida";
        }else{
            return "Marcha minima ja alcancada";
        }
    }

}

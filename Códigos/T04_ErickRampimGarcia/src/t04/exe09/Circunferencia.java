package t04.exe09;

public class Circunferencia {
    private double r;

    public Circunferencia(double r){
        this.r = r;
    }

    public double getR(){
        return this.r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double calculaArea(){
        return Math.pow(this.r, 2) * 3.14;
    }
}

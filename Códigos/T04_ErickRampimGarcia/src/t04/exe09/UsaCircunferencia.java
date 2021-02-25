package t04.exe09;

public class UsaCircunferencia {
    private double r;

    public UsaCircunferencia(double r){
        this.r = r;
    }

    public double getR(){
        return this.r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double usaCircunferencia(){
        Circunferencia circunferencia = new Circunferencia(r);
        return circunferencia.calculaArea();
    }

    public String toString(){
        double area = usaCircunferencia();
        return String.format("\nRaio: %.2f\nÁrea: %.2f", this.r, area);
    }
}

package t04.exe03;

public class Ponto3D {
    private double x;
    private double y;
    private double z;
    private String cor;
    private double intensidade;

    public Ponto3D(double x, double y, double z, String cor, double intensidade){
        this.x = x;
        this.y = y;
        this.z = z;
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public Ponto3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getZ(){
        return this.z;
    }

    public void setZ(double z){
        this.z = z;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getIntensidade(){
        return this.intensidade;
    }

    public void setIntensidade(double intensidade){
        this.intensidade = intensidade;
    }

    public double calculaDistancia(Ponto3D p, Ponto3D obj){        
        double[] r = {(p.x-obj.x), (p.y-obj.y), (p.z-obj.z)};
        double sumPow = Math.pow(r[0], 2) + Math.pow(r[1], 2) + Math.pow(r[2], 2);
        double dist = Math.sqrt(sumPow);

        return dist;
    }

    public String toString(){
        return String.format("\n\nCoordenadas: (%.2f, %.2f, %.2f)\nCor: %s\nIntensidade: %.2f", x, y, z, cor, intensidade);
    }
}
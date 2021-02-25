package t05.exe03;

public class Ponto3D {
    private double x;
    private double y;
    private double z;
    private String cor;
    private double intensidade;

    private Ponto3D(double x, double y, double z, String cor, double intensidade){
        this.x = x;
        this.y = y;
        this.z = z;
        this.cor = cor;
        this.intensidade = intensidade;
    }

    private Ponto3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private double getX(){
        return this.x;
    }

    private void setX(double x){
        this.x = x;
    }

    private double getY(){
        return this.y;
    }

    private void setY(double y){
        this.y = y;
    }

    private double getZ(){
        return this.z;
    }

    private void setZ(double z){
        this.z = z;
    }

    private String getCor(){
        return this.cor;
    }

    private void setCor(String cor){
        this.cor = cor;
    }

    private double getIntensidade(){
        return this.intensidade;
    }

    private void setIntensidade(double intensidade){
        this.intensidade = intensidade;
    }

    private double calculaDistancia(Ponto3D p, Ponto3D obj){        
        double[] r = {(p.x-obj.x), (p.y-obj.y), (p.z-obj.z)};
        double sumPow = Math.pow(r[0], 2) + Math.pow(r[1], 2) + Math.pow(r[2], 2);
        double dist = Math.sqrt(sumPow);

        return dist;
    }

    private String toString(){
        return String.format("\n\nCoordenadas: (%.2f, %.2f, %.2f)\nCor: %s\nIntensidade: %.2f", x, y, z, cor, intensidade);
    }
}
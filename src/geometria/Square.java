package geometria;
import java.util.Scanner;

public class Square {
    Scanner sn = new Scanner(System.in);

    protected double lado;
    protected double altura;

    public Square(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    public Square(){
        System.out.println("Ingresa las medidas del cuadrado");
        System.out.println("Lado: ");
        lado = sn.nextDouble();
        System.out.println("Altura: ");
        altura = sn.nextDouble();

    }
    public void setLado(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado(){
        return lado;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return lado * altura;
    }

    public double getPerimetro(){
        return lado * 4;
    }
}

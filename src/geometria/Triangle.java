package geometria;
import java.util.Scanner;
public class Triangle {
    Scanner sn = new Scanner(System.in);

    private double lado;
    private double altura;
    private double base;

    public Triangle(double lado, double altura, double base) {
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    public Triangle() {
        System.out.println("Ingrese las medidas del triangulo: ");
        System.out.println("Lado: ");
        lado = sn.nextDouble();
        System.out.println("Base: ");
        base = sn.nextDouble();
        System.out.println("Altura: ");
        altura = sn.nextDouble();
    }

    public void setLado(double lado, double altura, double base) {
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        return (base * altura) / 2.0;
    }

    public double getPerimetro() {
        return lado * 3.0;
    }
}

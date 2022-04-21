package geometria;
import java.util.Scanner;

public class Circle {
    Scanner sn = new Scanner(System.in);

    public static final double PI = 3.141592;
    private double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    public Circle(){
        System.out.println("Ingrese el radio: ");
        radio = sn.nextDouble();
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getDiametro(){
        return radio * 2;
    }

    public double getArea(){
        return PI * radio * radio;
    }

    public double getPerimetro(){
        return PI * getDiametro();
    }
}

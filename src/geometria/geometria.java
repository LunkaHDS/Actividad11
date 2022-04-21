package geometria;
import java.util.Scanner;

public class geometria {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int sideLength, heightLength;
        int decision, opcion, figA, figP = 0;
        boolean salir = false;

        while(!salir){
            System.out.println("Bienvenido ");
            System.out.println("Selecciona propiedad a calcular");
            System.out.println("1. Area \n2. Perimetro");
            decision = sn.nextInt();
            System.out.println("");
            switch(decision){
                    case 1:
                    System.out.println("Area");
                    System.out.println("Seleccione una figura \n1. Circulo \n2. Cuadrado \n3. Triangulo \n0. Salir");
                    figA = sn.nextInt();
                    System.out.println("");
                    switch(figA){
                        case 1: Circle circle = new Circle();
                            System.out.println("El area es: " + circle.getArea() + "cm");
                            System.out.println("");
                            break;

                        case 2: Square square = new Square();
                            System.out.println("El area es: " + square.getArea() + " cm");
                            System.out.println("");
                            break;

                        case 3: Triangle triangle = new Triangle();
                            System.out.println("El area es: " + triangle.getArea() + " cm");
                            System.out.println("");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Perimetro");
                    System.out.println("Seleccione una figura \n1. Circulo \n2. Cuadrado \n3. Triangulo");
                    figP = sn.nextInt();
                    System.out.println("");
                    switch(figP){
                        case 1: Circle circle = new Circle();
                            System.out.println("El perimetro es: " + circle.getPerimetro()+ " cm");
                            System.out.println("");
                            break;

                        case 2: Square square = new Square();
                            System.out.println("El perimetro es: " + square.getPerimetro() + " cm");
                            System.out.println("");
                            break;

                        case 3: Triangle triangle = new Triangle();
                            System.out.println("El perimetro es: " + triangle.getPerimetro() + " cm");
                            System.out.println("");
                    }
                    break;

                case 0:
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}


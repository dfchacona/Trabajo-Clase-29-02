/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Estudiante
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        Triangulo t1= new Triangulo();
        int eleccion=1;
        do{
        System.out.println("Ingrese: "
                + "\n1. Para registrar punto"
                + "\n2. Para registrar color"
                + "\n3. Para conocer el area del triangulo"
                + "\n4. Para conocer la altura del triangulo"
                + "\n5. Para conocer el perimetro del triangulo"
                + "\n0 Para terminar el programa");
        eleccion= lectura.nextInt();
        switch (eleccion){
            case(1):
            System.out.println("Ingrese coordenada x: ");
            double x= lectura.nextDouble();
            System.out.println("Ingrese coordenada y: ");
            double y= lectura.nextDouble();
            t1.registrarPuntos(x, y);
            if(t1.getPuntosRegistrados()==3){
                t1.calcularBase();
                System.out.println(t1.getBase());
                t1.calcularPerimetro();
                
                t1.calcularAltura();
                t1.calcularArea();
            }
            break;
            
            case(2):
            System.out.println("Ingrese r: ");
            int r= lectura.nextInt();
            System.out.println("Ingrese b: ");
            int b= lectura.nextInt();
            System.out.println("Ingrese g: ");
            int g= lectura.nextInt();
            t1.registrarColores(r, g, b);   
            break;
            case(3):
            if(t1.getPuntosRegistrados()<3){
                System.out.println("Ingrese los puntos completos e intente nuevamente");
            }else{
                
                System.out.println(t1.getArea());
            }
            break;
            case(4):
            if(t1.getPuntosRegistrados()<3){
                System.out.println("Ingrese los puntos completos e intente nuevamente");
            }else{
                
                System.out.println(t1.getAltura());
            }
            break;
            case(5):
            if(t1.getPuntosRegistrados()<3){
                System.out.println("Ingrese los puntos completos e intente nuevamente");
            }else{
               
                System.out.println(t1.getPerimetro());
            }
            break; 
        }
        }while (eleccion!=0);
    }
    
}

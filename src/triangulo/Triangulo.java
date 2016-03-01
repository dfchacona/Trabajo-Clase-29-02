
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulo;
import java.lang.Math;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 *
 * @author Estudiante
 */
public class Triangulo {
    
    private Punto [] puntos; 
    private Color [] colores; 
    private double perimetro; 
    private double altura; 
    private double area; 
    private double base; 
    private int puntosRegistrados=0; 
    private int coloresRegistrados=0; 

    public Triangulo() {
        
        this.puntos= new Punto[3];
        this.colores=new Color[2];
        
    }
    
    public void registrarPuntos(double x, double y){
        if(this.puntosRegistrados<3){
          this.puntos[this.puntosRegistrados]=new Punto(x,y); 
          this.puntosRegistrados++;
        
    }else{
        System.out.println("Puntos Registrados");
        }
    }
    
     public void registrarColores(int r, int g, int b){
        if(r<0||r>225||b<0||b>225||g<0||g>225){
            System.out.println("Datos invalidos");
        }else{
        if(this.coloresRegistrados<2){ 
          this.colores[this.coloresRegistrados]=new Color(r,g, b); 
        
     }else{
       System.out.println("Colores Registrados");     
        }
     }}
        
    
    public double calcularDistancia(double a, double b, double c, double d){
        
        double distancia=sqrt(pow((c-d),2)+pow(a-b,2));
        
        return distancia;
    }
    
     
    public void calcularPerimetro(){
    
       Punto p1= this.puntos[0];
       Punto p2= this.puntos[1];
       Punto p3= this.puntos[2];
       this.perimetro=(calcularDistancia(p2.getY(),p1.getY(),p2.getX(),p1.getX())+calcularDistancia(p3.getX(),p2.getX(),p3.getY(),p2.getY())+
              calcularDistancia(p1.getX(), p3.getX(), p1.getY(), p3.getY()));  
           
    }
    
    public void calcularBase(){
        Punto p1=this.puntos[0];
        Punto p2=this.puntos[1];
        double base=(calcularDistancia(p2.getX(),p1.getX(),p2.getY(),p1.getY()));
        this.base=base;
    }
    
    public void calcularAltura(){
        Punto p1= this.puntos[0];
        Punto p2= this.puntos[1];
        Punto p3= this.puntos[2];
        double semiPerimetro=(this.perimetro/2);
        this.altura=(2/this.base)*(sqrt(semiPerimetro*(semiPerimetro-this.base)*(semiPerimetro-calcularDistancia(p3.getX(),p2.getX(),p3.getY(),p2.getY()))*(semiPerimetro-
                 calcularDistancia(p1.getX(), p3.getX(), p1.getY(), p3.getY()))));
        
    }
    public void calcularArea(){
        this.area=(this.base*this.altura)/2;
    }

    public int getPuntosRegistrados() {
        return puntosRegistrados;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public double getBase() {
        return base;
    }
    
    
    
}

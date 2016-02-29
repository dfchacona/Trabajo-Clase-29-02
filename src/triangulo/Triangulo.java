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
public class Triangulo {
    private Punto [] puntos; 
    private Color [] colores; 

    public Triangulo() {
        
        this.puntos= new Punto[3];
        this.colores=new Color[2];
        
    }
    
    public void registrarPuntos(int x, int y){
       
        for (int i = 0; i < 3; i++) {
          this.puntos[i]=new Punto(x,y); 
        }
        
    }
    
     public void registrarColores(int r, int g, int b){
       
        for (int i = 0; i < 2; i++) {
          this.colores[i]=new Color(r,g, b); 
        }
        
    }
}

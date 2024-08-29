
package Guia07.actividad5;

public class auto_12 {
    
    String color;
    int velocidad;
        
    public auto_12 (String color, int velocidad){
        
        this.color = color;
        this.velocidad = velocidad;
    }
    
    
    public void mostrarDatos(){
        
        System.out.println("El auto es de color "+color);
        System.out.println("El auto recorre  "+velocidad + " Km");
    
    }
}

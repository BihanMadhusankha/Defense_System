/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystem;

/**
 *
 * @author BIHAN
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer controller = new Observer();
       
        controller.addObservers(new Helicopter(controller));
        controller.addObservers(new Tank(controller));
        controller.addObservers(new Submarine(controller));
        
        controller.addObservers(new MainController(controller));
        
    }
    
}

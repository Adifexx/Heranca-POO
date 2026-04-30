/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author alunolab10
 */
public class Animal {
    String picture, food, hunger, boundaries, location;
    
    void makeNoise(){System.out.println("Animal: makeNoise() - 1");}
    void eat(){System.out.println("Animal: eat() - 1");}
    void sleep(){System.out.println("Animal: sleep()");}
    void roam(){System.out.println("Animal: roam() - 1");}
    

    public Animal(String picture, String food, String hunger, String boundaries, String location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }

    public Animal() {
    }
    
    
    
    
    
}

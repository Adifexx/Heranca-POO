/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public abstract class Animal extends SerVivo{
    String sexo;
    
    void respirar(){
        System.out.println("Animal: respirar() - AR");
    }

    void mover(){
        System.out.println("Animal: mover()");
    }
    
   /* void falar(){
        System.out.println("Animal: falar() - ????");
    }
    */

    //abstract void falar();
    abstract String falar();
    

}

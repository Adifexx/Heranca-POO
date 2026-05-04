/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class Peixe extends Animal implements IPet{
    void respirar(){
        System.out.println("Peixe: respirar() - AGUA");
    }

    String falar() {
        return "Peixe: falar() - GLUB GLUB";
    }
    
    /*void falar() {
        System.out.println("Peixe: falar() - GLUB GLUB");
    }
    */
    public void tratar(){
        System.out.println("Peixe: tratar() - Dar Banho");
    }
    
    
    
}

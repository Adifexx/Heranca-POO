/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

/**
 *
 * @author alunolab10
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==SerVivo==");
        SerVivo sv = new SerVivo();
        sv.tamanho = 10;
        sv.nascer();
        sv.crescer();
        sv.morrer();
        
          
        
        System.out.println("==Animal==");
        Animal an = new Animal();
        an.mover();
        an.respirar();
        an.crescer();
        an.morrer();
        
        
        
        System.out.println("==Mamifero==");
        Mamifero ma = new Mamifero();
        ma.nascer();
        ma.respirar();
        
        
        
        System.out.println("==Peixe==");
        Peixe p = new Peixe();
        p.mover();
        p.respirar();
        
        
        
    }
    
}

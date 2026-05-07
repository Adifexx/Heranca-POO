/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public abstract class Ponto {
    
    float x, y;
    String cor;
    
    abstract void desenhar();
    
    String getCor(){
        return "Ponto: getCor()";
    }

    /*public Ponto(float x, float y, String cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    */
    
    
    
}

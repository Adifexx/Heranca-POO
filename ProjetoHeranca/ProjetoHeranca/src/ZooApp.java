void main(){
    
    System.out.println("== SerVivo ==");
    SerVivo sv = new SerVivo();
    sv.tamanho = 10;
    sv.nascer();
    sv.crescer();
    sv.morrer();
    
    /*System.out.println("== Animal ==");
    Animal an = new Animal();
    an.mover();
    an.respirar();
    an.nascer();
    an.crescer();
    */
    
    System.out.println("== Mamifero ==");
    Mamifero ma = new Mamifero();
    ma.nascer();
    ma.respirar();
    System.out.println(ma.falar());
    
    System.out.println("== Peixe ==");
    Peixe px = new Peixe();
    px.nascer();
    px.mover();
    px.respirar();
    System.out.println(px.falar());
    px.tratar();
    
    System.out.println("== Ave ==");
    Ave av = new Ave();
    av.nascer();
    av.mover();
    av.respirar();
    System.out.println(av.falar());
    
    
    
    
    

    
    
}

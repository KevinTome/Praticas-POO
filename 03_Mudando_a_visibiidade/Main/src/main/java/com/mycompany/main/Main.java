
package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        //MUDANÇAS EM VARIAVEIS PUBLIC = TRUE
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        
        //MUDANÇAS EM VARIAVEIS PRIVATE = FALSE
        //c1.ponta = 0.5f;
        
        //MUDANÇAS EM VARIAVEIS PROTECTED = TRUE
        c1.carga = 80;
        
        //MUDANÇAS EM VARIAVEIS PRIVATE COM METODOS PUBLIC = TRUE
        c1.destampar();
        
        c1.status();
    }
}

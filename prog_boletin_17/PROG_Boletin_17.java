/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_17;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.camina();
        gato.nada();
        
        Papagaio pg = new Papagaio();
        pg.camina();
        pg.voa();
        
        IPodeCaminar avestruz = new Avestruz();
        avestruz.camina();
        
        Felino tigre = new Tigre();
        tigre.camina();
        tigre.nada();
        tigre.felinoToString();
        
        Mamifero gato2= new Gato();
        gato2.camina();
        gato2.nada();
        gato2.mamiferoToString();
        
    }
    
}

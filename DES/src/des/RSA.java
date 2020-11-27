/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author navy
 */
public class RSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CifrarRSA RSA = new CifrarRSA(32);
        System.out.println("Generar Primos");
        RSA.generarPrimos();
        System.out.println("Generar claves");
        RSA.generarClaves();
        System.out.println("D");
        System.out.println(RSA.dameD());
        System.out.println("E");
        System.out.println(RSA.dameE());
        System.out.println("N");
        System.out.println(RSA.dameN());
        System.out.println("P");
        System.out.println(RSA.dameP());
        System.out.println("Phi");
        System.out.println(RSA.damePhi());
        System.out.println("Q");
        System.out.println(RSA.dameQ());
        String texto = "Robinette";
        System.out.println("Encrinptado"); 
        for (int i = 0; i < RSA.encriptar(texto).length; i++) {
            System.out.println(RSA.encriptar(texto)[i]);
        }
        System.out.println("Desencriptar");
        System.out.println(RSA.desencriptar(RSA.encriptar(texto)));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author demon
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//usar una libreria que se encarga de los metodos de cifrado y de la generacion de claves de seguridad
import javax.crypto.*;

import javax.crypto.interfaces.*;
//esta libreria sirve para la creacion de claves a partir de una interfaz

import javax.crypto.spec.*;
//libreria que nos ayuda a generar las sub llaves del algortimo seleccionado

import java.security.*;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
//libreria que nos ayuda a definir el tipo de algoritmo de seguridad que se ocupa sea simetrico o asimetrico

public class DES {

    /**
     * @param args the command line arguments
     *
     * Vamos a crear un cifrador descifrador de archivos a traves del uso del
     * algortimo DES
     *
     *
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, FileNotFoundException, IOException, IllegalBlockSizeException, BadPaddingException {
        // TODO code application logic here
        Interfaz formulario1 = new Interfaz();
        formulario1.setBounds(0, 0, 600, 600);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);


    }

    public static void mensajeAyuda() {
        System.out.println("Ejemplo de Cifrado DES, utilizando una llave HASH");
        System.out.println("\t Sintesis: Manejo de ficheros por favor agregue un fichero a este"
                + "programa para que pueda ejecutarse, debe de ser un texto plano '.txt' ");
        System.out.println();
    }

    public static void mostrarBytes(byte[] buffer) {
        //que este metodo nos va a convertir los archivos en bytes
        System.out.write(buffer, 0, buffer.length);
    }
/*//Favor de ignorar este comentario
    String textocifrado;

    public String Cifrado(String mensaje) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        KeyGenerator generadorDES = KeyGenerator.getInstance("DES");
        generadorDES.init(56);  //la llave debe de ser de 56 bits

            //vamos a instancear la clave para que se genere
        
        SecretKey clave = generadorDES.generateKey();
        clave.getEncoded();
        mostrarBytes(clave.getEncoded());
        Cipher cifrador = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cifrador.init(Cipher.ENCRYPT_MODE, clave);
        byte[] campoCifrado=cifrador.doFinal(mensaje.getBytes());
        new String(campoCifrado);
        String base64 = new BASE64Encoder().encode(campoCifrado);
        textocifrado=base64;
        return textocifrado;
    }
    String textodescifrado;
    public String Descifrado(String mensaje) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {
        KeyGenerator generadorDES = KeyGenerator.getInstance("DES");
        generadorDES.init(56);  //la llave debe de ser de 56 bits

            //vamos a instancear la clave para que se genere
        
        SecretKey clave = generadorDES.generateKey();
        clave.getEncoded();
        mostrarBytes(clave.getEncoded());
        Cipher cifrador = Cipher.getInstance("DES/ECB/PKCS5Padding");
        byte[]  base64 = new BASE64Decoder().decodeBuffer(mensaje);
        cifrador.init(Cipher.DECRYPT_MODE, clave);
        byte[] mensajeDescifrado = cifrador.doFinal(base64);
        System.out.println(mensajeDescifrado);
        String mensaje_claro = new String(mensajeDescifrado);
        //System.out.println(mensajeDescifrado);
        //System.out.println(mensaje_claro);
        
        textodescifrado=mensaje_claro;
        return textodescifrado;
    }
*/
    

}

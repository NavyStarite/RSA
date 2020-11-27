package des;

//librerias wiiiii que hagan todo por mi *w*
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
//para poder hacer el cifrado

import javax.crypto.spec.SecretKeySpec;
//para poder realizar las subllaves del algoritmo

import java.util.Base64;
import java.util.*;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import static javax.xml.crypto.dsig.Transform.BASE64;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class AES {
/*
    public byte[] stringToBytes(String s) {
        byte[] b2 = new BigInteger(s, 36).toByteArray();
        return Arrays.copyOfRange(b2, 1, b2.length);
    }

    public String bytesToString(byte[] b) {
        byte[] b2 = new byte[b.length + 1];
        b2[0] = 1;
        System.arraycopy(b, 0, b2, 1, b.length);
        return new BigInteger(b2).toString(36);
    }
    
    public static void main(String[] args) {
        TextoCifrado cifrado = new TextoCifrado(9223372036854775808,9223372036854775808,9223372036854775808);
        BigManager bin = new BigManager();
        bin.writeObject(cifrado);

        bin.writeObject(cifrado);

        TextoCifrado readed = (TextoCifrado) bin.readObject();

        System.out.println(
                readed.getNum1() + " --> "
                + readed.getNum2() + " --> "
                + readed.getTextocifrado() + " --> "
                + readed.getExcluded()
        );
    }

    public String textocifrado;

    public String Cifrado(String mensaje, String clave) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        /*Inserte codigo rsa
        
         *-/
        textocifrado = mensaje;
        return textocifrado;

    }

    String textodescifrado;

    public String Descifrado(String msjcifrado, String clave) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException, IOException {

        textodescifrado = msjcifrado;
        return textodescifrado;
    }
*/}

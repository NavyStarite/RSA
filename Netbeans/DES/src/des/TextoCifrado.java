/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.math.BigInteger;

/**
 *
 * @author roberto
 */
class TextoCifrado implements java.io.Serializable {
    private BigInteger [] textocifrado;
    private BigInteger [] num1;
    private BigInteger [] num2;
    private transient int excluded = 1; // NULL

    public TextoCifrado(BigInteger[] textocifrado, BigInteger[] num1, BigInteger[] num2) {
        this.textocifrado = textocifrado;
        this.num1 = num1;
        this.num2 = num2;
    }

    public BigInteger[] getTextocifrado() {
        return textocifrado;
    }

    public BigInteger[] getNum1() {
        return num1;
    }

    public BigInteger[] getNum2() {
        return num2;
    }

    public int getExcluded() {
        return excluded;
    }

    
}

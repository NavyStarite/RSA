/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author roberto
 */
class BigManager {

    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public void writeObject(Object object) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
            oos.writeObject(object);
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Object readObject() {
        Object object;

        try {
            ois = new ObjectInputStream(new FileInputStream("file.txt"));
            object = ois.readObject();

            return object;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}

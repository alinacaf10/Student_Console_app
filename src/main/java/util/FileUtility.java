/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class FileUtility {

    public static Object readFile(String name) {
        Object obj = null;
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name))) {
            obj = ois.readObject();
        } finally {
            return obj;
        }
    }

    public static boolean writeObjectToFile(Object obj, String name) throws RuntimeException {
        try (
                FileOutputStream fo = new FileOutputStream(name); ObjectOutputStream os = new ObjectOutputStream(fo);)
        {
            os.writeObject(obj);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}

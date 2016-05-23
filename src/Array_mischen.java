/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tmeyer
 */
import java.util.Random;

public class Array_mischen {

    /**
     *
     * @param zahlen
     * @return
     */
    public static int[] arrayMix(int[] zahlen) {
        int tmp;
        int rand;
        Random r = new Random();
        for (int i = 0; i < zahlen.length; i++) {
            rand = r.nextInt(zahlen.length);
            tmp = zahlen[i];
            zahlen[i] = zahlen[rand];
            zahlen[rand] = tmp;
        }
        return zahlen;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.algo.project;

/**
 *
 * @author hp
 */
import java.util.*;

public class Solution1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int slice[] = {2, 3, 6, 4};

        Arrays.sort(slice);
       
        boolean makeHappy = true;

        for (int i = 1; i <= slice.length; i++) {

            if (slice[i - 1] >= i) {

                makeHappy = true;

            } else {

                makeHappy = false;

                break;

            }

        }

        System.out.println("Possible to distribute " + makeHappy);

    }

}

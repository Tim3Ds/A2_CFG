/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2_CFG;
// Test Context-Free Grammar Class
import java.io.*;
   
/**
 *
 * @author test
 */
public class testCFG {
    public static void main(String[] args)
   {
        // Language: strings that contain 0+ b's, followed by 2+ a's,
        // followed by 1 b, and ending with 2+ a's.
        String[] C = {"S=>bS",
                      "S=>aaT",
                      "T=>aT",
                      "T=>bU",
                      "U=>Ua",
                      "U=>aa"};

        String inString, startWkString;
        boolean accept1;
        Part_A_CGF CFG1 = new Part_A_CGF(C);
        for(int i=0;args.length > i;i++)
        {
            // Input string is command line parameter
            inString = args[i];
                     char[] startNonTerm = new char[1];
            startNonTerm[0] = CFG1.getStartNT();
                     startWkString = new String(startNonTerm);
            accept1 = CFG1.processData(inString, startWkString);
            System.out.println("  Accept String?  " + accept1);
        }
   } // end main
} // end class
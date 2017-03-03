/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2_CFG;

/**
 *
 * @author test
 */
public class Part_B_4 {
    public static void main(String[] args) {
        // A CFG for alphabet {x,y,z} that recognizes the language consisting of
        // all strings that start with z, followed by N x's (N >= 0), followed 
        // by twice as many y's, and ending with z. 
        // Test your program with the following input strings:
	//		zz, zxxyyz, zxxyyyy, zxyyz, zxxyyyyz
        String[] C = {""};

        String inString, startWkString;
        boolean accept1;
        Part_A_CGF CFG1 = new Part_A_CGF(C);
        for(int i=0;args.length > i; i++)
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
}

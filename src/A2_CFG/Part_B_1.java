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
public class Part_B_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A CFG for alphabet {a,b} that recognizes the language consisting of 
        // all strings that start with an odd number of a's followed by the 
        // same number of b's. 
        // Test your program with the following input strings:
	//		ab, aabb, aaabbb, aaabbbbb, aaaabbb
        String[] C = {"S=>aaSbb",
                      "S=>ab"};

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
} // end class
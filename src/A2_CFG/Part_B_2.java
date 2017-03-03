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
public class Part_B_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A CFG for alphabet {a,b} that recognizes the language consisting of 
        // all strings of length 1 or greater that do not contain the substring 
        // aa.  
        // Test your program with the following input strings:
	//		abba, abbabaaa, abaabab, bababbab, bbbabba
        String[] C = {"S=>aT",
                      "S=>bS",
                      "T=>bT",
                      "T=>a",
                      "T=>b"};

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
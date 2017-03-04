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
public class Part_B_3 {
    public static void main(String[] args) {
        // A CFG for alphabet {a,b} that recognizes the language consisting of 
        // all strings that contain exactly one b, have 2N a's 
        // (N >= 0, N is an integer) before the b, and 2N+1 a's after the b. 
        // Test your program with the following input strings:
	//		ba, aaabaaaa, aabaaa, abaa, aaaabaaa
        String[] C = {"S=>Ta",
                      "T=>aTa",
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
}

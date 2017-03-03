/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2_CFG;

import java.util.Arrays;

/**
 *
 * @author test
 */
public class Part_A_CGF {
    //Instance variables:
    private final String[] Code;//	-- production rules as program code
    private char startNT;	//	-- starting nonterminal

    //Constructor:
    Part_A_CGF(String[] C){
        Code = C;
        startNT = C[0].charAt(0);
    }

    //Methods:
    public char getStartNT(){
        return startNT;
    }
    public void setStartNT(char stNT){
        startNT = stNT;
    }
    // wkSting is work string (build from production rules)
    public boolean processData(String inString, String wkString){
        //System.out.println("wkString: " + wkString);
        //If inString and wkString are equa then return true
        if(inString.equals(wkString))
            return true;
        //If wkString is larger than inString then return false
        if(inString.length() <= wkString.length())
            return false;
        //Search for a nonterminal (Upper Case character) in wkString
        int dex;
        String NonTerm = "";
        int len = wkString.length();
        for(dex = 0; len>dex; dex++){
            if(Character.isUpperCase(wkString.charAt(dex))){
                NonTerm = Character.toString(wkString.charAt(dex));
                //break;
                //For each production rule
                for(int i=0; Code.length>i;i++){
                    //If rule applies, 
                    if(Code[i].charAt(0) == wkString.charAt(dex)){
                        //make substitution for nonterminal creating a new working string
                        String[] work = wkString.split(NonTerm);
                        switch (work.length) {
                            case 0:
                                //Recursive call to processData with new working string
                                if(processData(inString, Code[i].substring(3)))
                                    return true;
                                break;
                            case 1:
                                //Recursive call to processData with new working string
                                if(processData(inString, work[0] + Code[i].substring(3)))
                                    return true;
                                break;
                            case 2:
                                //Recursive call to processData with new working string
                                if(processData(inString, work[0] + Code[i].substring(3) + work[1]))
                                    return true;
                                break;
                            default:
                                break;
                        }
                    }// check non-terminals 
                   
                }// end for non-terminal 
                
            }// end if termianl 
//            // If no nonterminals exist in wkString then return false
//            if(NonTerm == "")
//                return false;
        }// end parse of string 
        return false;
    }//End For end processData
        
    
                 
                         
   
    
////    // inSring is tested string (will not change)
////    public boolean processData(String inString, String wkString){
////        //if instring and wksting are equal
////        if(inString.equals(wkString))
////            return true;
////        //if wkstring is larger then in string 
////        if(inString.length() < wkString.length())
////            return false;
////        String work = "";
////        String[] newWK = {"",""};
////        //search for nonterminal (uppercase character) in wk stirng
////        for(int dex=0; wkString.length()>dex; dex++){
////            if(Character.isUpperCase(wkString.charAt(dex))){
////                if(dex>1){
////                    newWK = wkString.split( Character.toString(wkString.charAt(dex)));
////                }
////                    
////                //for each production rull
////                for(int i=0; Code.length>i;i++){
////                    //if rule applies, make substitutiuon for nonterminal
////                    if(Code[i].charAt(0) == wkString.charAt(dex)){
////                        // prevent using incorect prodection rule
////                        wkString = Code[i+1].substring(3);
////                        if(newWK.length == 1){
////                            work += newWK[0];
////                            work += wkString;
////                            if(newWK.length == 2){
////                                work+=newWK[1];
////                            }
////                            System.out.println("instring: " + inString);
////                            System.out.println("wkString: " + wkString );
////                            System.out.println("work: " + work);
////                            return processData(inString, work);
////                        }else{
////                            System.out.println("instring: " + inString);
////                            System.out.println("wkString: " + wkString );
////                            System.out.println("work: " + work);
////                            return processData(inString, wkString);
////                        }
////                    }
////                }
////            }
////        }
//        return false;
//    }
}

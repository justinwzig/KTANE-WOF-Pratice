/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wofpractice;

/**
 *
 * @author Matthew
 */
public class WOFPractice {

    /**
     * @param args the command line arguments
     */
        public static String[] wordList;
        public static String[] choices;
        public static String solution;
        public static Object[] stepOne;
        public static Object[] order;
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        wordList = Module.whichWord(0);
        choices = Module.answers(wordList);
        solution = Module.findAnswer(choices, wordList);
        stepOne = Module.stepOne(wordList[14]);
        order = Module.positionFive((String)stepOne[0], (int)stepOne[1], choices);
        
    }
    
}

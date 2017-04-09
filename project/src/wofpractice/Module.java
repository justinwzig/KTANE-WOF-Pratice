/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wofpractice;
import java.util.*;
/**
 *
 * @author Matthew
 */
//The last word (14th entry from zero) in each array is the word the array corresponds to.
public class Module {
public static String[] ready = {"YES","OKAY","WHAT","MIDDLE","LEFT","PRESS","RIGHT","BLANK","READY","NO","FIRST","UHHH","NOTHING","WAIT","READY"};
public static String[] first = {"LEFT","OKAY","YES","MIDDLE","NO","RIGHT","NOTHING","UHHH","WAIT","READY","BLANK","WHAT","PRESS","FIRST","FIRST"};
public static String[] no = {"BLANK","UHHH","WAIT","FIRST","WHAT","READY","RIGHT","YES","NOTHING","LEFT","PRESS","OKAY","NO","MIDDLE","NO"};
public static String[] blank = {"WAIT","RIGHT","OKAY","MIDDLE","BLANK","PRESS","READY","NOTHING","NO","WHAT","LEFT","UHHH","YES","FIRST","BLANK"};
public static String[] nothing = {"UHHH","RIGHT","OKAY","MIDDLE","YES","BLANK","NO","PRESS","LEFT","WHAT","WAIT","FIRST","NOTHING","READY","NOTHING"};
public static String[] yes = {"OKAY","RIGHT","UHHH","MIDDLE","FIRST","WHAT","PRESS","READY","NOTHING","YES","LEFT","BLANK","NO","WAIT","YES"};
public static String[] what = {"UHHH","WHAT","LEFT","NOTHING","READY","BLANK","MIDDLE","NO","OKAY","FIRST","WAIT","YES","PRESS","RIGHT","WHAT"};
public static String[] uhhh = {"READY","NOTHING","LEFT","WHAT","OKAY","YES","RIGHT","NO","PRESS","BLANK","UHHH","MIDDLE","WAIT","FIRST","UHHH"};
public static String[] left = {"RIGHT","LEFT","FIRST","NO","MIDDLE","YES","BLANK","WHAT","UHHH","WAIT","PRESS","READY","OKAY","NOTHING","LEFT"};
public static String[] right = {"YES","NOTHING","READY","PRESS","NO","WAIT","WHAT","RIGHT","MIDDLE","LEFT","UHHH","BLANK","OKAY","FIRST","RIGHT"};
public static String[] middle = {"BLANK","READY","OKAY","WHAT","NOTHING","PRESS","NO","WAIT","LEFT","MIDDLE","RIGHT","FIRST","UHHH","YES","MIDDLE"};
public static String[] okay = {"MIDDLE","NO","FIRST","YES","UHHH","NOTHING","WAIT","OKAY","LEFT","READY","BLANK","PRESS","WHAT","RIGHT","OKAY"};
public static String[] wait = {"UHHH","NO","BLANK","OKAY","YES","LEFT","FIRST","PRESS","WHAT","WAIT","NOTHING","READY","RIGHT","MIDDLE","WAIT"};
public static String[] press = {"RIGHT","MIDDLE","YES","READY","PRESS","OKAY","NOTHING","UHHH","BLANK","LEFT","FIRST","WHAT","NO","WAIT","PRESS"};
public static String[] you = {"SURE","YOU ARE","YOUR","YOU'RE","NEXT","UH HUH","UR","HOLD","WHAT?","YOU","UH UH","LIKE","DONE","U","YOU"};
public static String[] youare = {"YOUR","NEXT","LIKE","UH HUH","WHAT?","DONE","UH UH","HOLD","YOU","U","YOU'RE","SURE","UR","YOU ARE","YOU ARE"};
public static String[] your = {"UH UH","YOU ARE","UH HUH","YOUR","NEXT","UR","SURE","U","YOU'RE","YOU","WHAT?","HOLD","LIKE","DONE","YOUR"};
public static String[] youre = {"YOU","YOU'RE","UR","NEXT","UH UH","YOU ARE","U","YOUR","WHAT?","UH HUH","SURE","DONE","LIKE","HOLD","YOU'RE"};
public static String[] ur = {"DONE","U","UR","UH HUH","WHAT?","SURE","YOUR","HOLD","YOU'RE","LIKE","NEXT","UH UH","YOU ARE","YOU","UR"};
public static String[] u = {"UH HUH","SURE","NEXT","WHAT?","YOU'RE","UR","UH UH","DONE","U","YOU","LIKE","HOLD","YOU ARE","YOUR","U"};
public static String[] uhhuh = {"UH HUH","YOUR","YOU ARE","YOU","DONE","HOLD","UH UH","NEXT","SURE","LIKE","YOU\'RE","UR","U","WHAT?","UH HUH"};
public static String[] uhuh = {"UR","U","YOU ARE","YOU'RE","NEXT","UH UH","DONE","YOU","UH HUH","LIKE","YOUR","SURE","HOLD","WHAT?","UH UH"};
public static String[] whatq = {"YOU","HOLD","YOU'RE","YOUR","U","DONE","UH UH","LIKE","YOU ARE","UH HUH","UR","NEXT","WHAT?","SURE","WHAT?"};
public static String[] done = {"SURE","UH HUH","NEXT","WHAT?","YOUR","UR","YOU'RE","HOLD","LIKE","YOU","U","YOU ARE","UH UH","DONE","DONE"};
public static String[] next = {"WHAT?","UH HUH","UH UH","YOUR","HOLD","SURE","NEXT","LIKE","DONE","YOU ARE","UR","YOU'RE","U","YOU","NEXT"};
public static String[] hold = {"YOU ARE","U","DONE","UH UH","YOU","UR","SURE","WHAT?","YOU'RE","NEXT","HOLD","UH HUH","YOUR","LIKE","HOLD"};
public static String[] sure = {"YOU ARE","DONE","LIKE","YOU'RE","YOU","HOLD","UH HUH","UR","SURE","U","WHAT?","NEXT","YOUR","UH UH","SURE"};
public static String[] like = {"YOU'RE","NEXT","U","UR","HOLD","DONE","UH UH","WHAT?","UH HUH","YOU","LIKE","SURE","YOU ARE","YOUR","LIKE"};

public static String[] whichWord(int chooser){
    int rand = 0;
    if(chooser==0){
    double r =  Math.random()*28+1;
    rand = (int) r;
    }
    else{
        rand=chooser;
    }
    if(rand==1)
        return ready;
    else if(rand==2)
        return first;
    else if(rand==3)
        return no;
    else if(rand==4)
        return blank;
    else if(rand==5)
        return nothing;
    else if(rand==6)
        return yes;
    else if(rand==7)
        return what;
    else if(rand==8)
        return uhhh;
    else if(rand==9)
        return left;
    else if(rand==10)
        return right;
    else if(rand==11)
        return middle;
    else if(rand==12)
        return okay;
    else if(rand==13)
        return wait;
    else if(rand==14)
        return press;
    else if(rand==15)
        return you;
    else if(rand==16)
        return youare;
    else if(rand==17)
        return your;
    else if(rand==18)
        return youre;
    else if(rand==19)
        return ur;
    else if(rand==20)
        return u;
    else if(rand==21)
        return uhhuh;
    else if(rand==22)
        return uhuh;
    else if(rand==23)
        return whatq;
    else if(rand==24)
        return done;
    else if(rand==25)
        return next;
    else if(rand==26)
        return hold;
    else if(rand==27)
        return sure;
    else//will always and only be if rand is 28
        return like;
}
//Use array from whichWord for answers
public static String[] answers (String[] words){
    String chosenword = words[14];
    String possible1 = null;
    String possible2 = null;
    String possible3 = null;
    String possible4 = null;
    String possible5 = null;
    while(1==1){
    double r =  Math.random()*13;
    int rand = (int) r;
    possible1 = words[rand];
    if(possible1.equals(chosenword)){
        continue;
    }
    break;
    }
    while(1==1){
    double r =  Math.random()*13;
    int rand = (int) r;
    possible2 = words[rand];
    if(possible2.equals(possible1)||possible2.equals(chosenword)){
        continue;
    }
    break;
    }
    while(1==1){
    double r =  Math.random()*13;
    int rand = (int) r;
    possible3 = words[rand];
    if(possible3.equals(possible2)||possible3.equals(possible1)||possible3.equals(chosenword)){
        continue;
    }
    break;
    }
    while(1==1){
    double r =  Math.random()*13;
    int rand = (int) r;
    possible4 = words[rand];
    if(possible4.equals(possible3)||possible4.equals(possible2)||possible4.equals(possible1)||possible4.equals(chosenword)){
        continue;
    }
    break;
    }
    while(1==1){
    double r =  Math.random()*13;
    int rand = (int) r;
    possible5 = words[rand];
    if(possible5.equals(possible4)||possible5.equals(possible3)||possible5.equals(possible2)||possible5.equals(possible1)||possible5.equals(chosenword)){
        continue;
    }
    break;
    }
    String[] ans = {chosenword,possible1,possible2,possible3,possible4,possible5};
    //TEMP
    /*
    System.out.println("Chosen word:");
    System.out.println(ans[0]);    
    System.out.println("Chosen answers:");
    System.out.println(ans[0]);
    System.out.println(ans[1]);
    System.out.println(ans[2]);
    System.out.println(ans[3]);
    System.out.println(ans[4]);
    System.out.println(ans[5]);
    */
    //END TEMP
    return ans;
}
//Use array from answers and then whichWord for findAnswer
public static String findAnswer(String[] choices, String[] wordList){
    String [] clone = wordList;
    List l = new ArrayList();
    l = Arrays.asList(clone);
    int a = l.indexOf(choices[0]);

    int b = l.indexOf(choices[1]);
    int c = l.indexOf(choices[2]);
    int d = l.indexOf(choices[3]);
    int e = l.indexOf(choices[4]);
    int f = l.indexOf(choices[5]);
    int ansPosition = minSix(a,b,c,d,e,f);
    String solution = wordList[ansPosition];
    //System.out.println("Solution: "+solution);
    return solution;
    
}

public static Object[] stepOne(String word){
    
    double rand =  Math.random()*28+1;
    int r = (int) rand;
    String display = null;
    int position = 0;
    //Zero is an error case. The buttons will count from 1 to 6 from top left to top right to middle left to middle right to bottom left to bottom right.
    if (r==1){
        display = "YES";
        position = 3;
    }
    else if (r==2){
        display = "FIRST";
        position = 2;
    }
    else if (r==3){
        display = "DISPLAY";
        position = 6;
    }
    else if (r==4){
        display = "OKAY";
        position = 2;
    }
    else if (r==5){
        display = "SAYS";
        position = 6;
    }
    else if (r==6){
        display = "NOTHING";
        position = 3;
    }
    else if (r==7){
        display = " ";
        position = 5;
    }
    else if (r==8){
        display = "BLANK";
        position = 4;
    }
    else if (r==9){
        display = "NO";
        position = 6;
    }
    else if (r==10){
        display = "LED";
        position = 3;
    }
    else if (r==11){
        display = "LEAD";
        position = 6;
    }
    else if (r==12){
        display = "READ";
        position = 4;
    }
    else if (r==13){
        display = "RED";
        position = 4;
    }
    else if (r==14){
        display = "REED";
        position = 5;
    }
    else if (r==15){
        display = "LEED";
        position = 5;
    }
    else if (r==16){
        display = "HOLD ON";
        position = 6;
    }
    else if (r==17){
        display = "YOU";
        position = 4;
    }
    else if (r==18){
        display = "YOU ARE";
        position = 6;
    }
    else if (r==19){
        display = "YOUR";
        position = 4;
    }
    else if (r==20){
        display = "YOU'RE";
        position = 4;
    }
    else if (r==21){
        display = "UR";
        position = 1;
    }
    else if (r==22){
        display = "THERE";
        position = 6;
    }
    else if (r==23){
        display = "THEY'RE";
        position = 5;
    }
    else if (r==24){
        display = "THEIR";
        position = 4;
    }
    else if (r==25){
        display = "THEY ARE";
        position = 3;
    }
    else if (r==26){
        display = "SEE";
        position = 6;
    }
    else if (r==27){
        display = "C";
        position = 2;
    }
    else{
        display = "CEE";
        position = 6;
    }
    Object[] ans = {display,position};
    //System.out.println("The display will be "+display+", so the choosen word ("+word+") will be in position "+position+".");
    return ans;
}


public static Object[] positionFive(String topWord, int occupied, String[] choices){
    String position1=null;
    String position2=null;
    String position3=null;
    String position4=null;
    String position5=null;
    String position6=null;
    //0 index is always the chosen word
    if(occupied==1){
        position1 = choices[0];
        position2 = choices[1];
        position3 = choices[2];
        position4 = choices[3];
        position5 = choices[4];
        position6 = choices[5];
    }
    else if(occupied==2){
        position1 = choices[1];
        position2 = choices[0];
        position3 = choices[2];
        position4 = choices[3];
        position5 = choices[4];
        position6 = choices[5];
    }
    else if(occupied==3){
        position1 = choices[1];
        position2 = choices[2];
        position3 = choices[0];
        position4 = choices[3];
        position5 = choices[4];
        position6 = choices[5];
    }
    else if(occupied==4){
        position1 = choices[1];
        position2 = choices[2];
        position3 = choices[3];
        position4 = choices[0];
        position5 = choices[4];
        position6 = choices[5];
    }
    else if(occupied==5){
        position1 = choices[1];
        position2 = choices[2];
        position3 = choices[3];
        position4 = choices[4];
        position5 = choices[0];
        position6 = choices[5];
    }
    else{
        position1 = choices[1];
        position2 = choices[2];
        position3 = choices[3];
        position4 = choices[4];
        position5 = choices[5];
        position6 = choices[0];
    }
    Object[] ans = {position1, position2, position3, position4, position5, position6};
    /*
    System.out.println("Printing in order:");
    System.out.println("   "+topWord);
    System.out.print(position1+"     ");
    System.out.println(position2);
    System.out.print(position3+"     ");
    System.out.println(position4);
    System.out.print(position5+"     ");
    System.out.println(position6);
    */
    return ans;
}


public static int minSix(int one, int two, int three, int four, int five, int six){
boolean oneb = false;
boolean twob = false;
boolean threeb = false;
boolean fourb = false;
boolean fiveb = false;
boolean sixb = false;
    if (one<two){
        oneb = true;
    }
    else{
        twob = true;
    }
    if(three<four){
        threeb=true;
    }
    else{
        fourb=true;
    }
    if(five<six){
        fiveb=true;
    }
    else{
        sixb=true;
    }
    if(oneb==true&&threeb==true){
        if(one<three){
            threeb = false;
            if(fiveb==true){
                if(one<five){
                    return one;
                }
                else{
                    return five;
                }
            }
            else{
                if(one<six){
                    return one;
                }
                else{
                    return six;
                }
            }
        }
        if(three<one){
            oneb=false;
            if(fiveb==true){
                if(three<five){
                    return three;
                }
                else{
                    return five;
                }
            }
            else{
                if(three<six){
                    return three;
                }
                else{
                    return six;
                }
            }
        }
    }
    else if(twob==true&&threeb==true){
        if(two<three){
            threeb = false;
            if(fiveb==true){
                if(two<five){
                    return two;
                }
                else{
                    return five;
                }
            }
            else{
                if(two<six){
                    return two;
                }
                else{
                    return six;
                }
            }
        }
        if(three<two){
            twob=false;
            if(fiveb==true){
                if(three<five){
                    return three;
                }
                else{
                    return five;
                }
            }
            else{
                if(three<six){
                    return three;
                }
                else{
                    return six;
                }
            }
        }
    }
    else if(oneb==true&&fourb==true){
        if(one<four){
            fourb = false;
            if(fiveb==true){
                if(one<five){
                    return one;
                }
                else{
                    return five;
                }
            }
            else{
                if(one<six){
                    return one;
                }
                else{
                    return six;
                }
            }
        }
        if(four<one){
            oneb=false;
            if(fiveb==true){
                if(four<five){
                    return four;
                }
                else{
                    return five;
                }
            }
            else{
                if(four<six){
                    return four;
                }
                else{
                    return six;
                }
            }
        }
    }
    else{
        if(two<four){
            fourb = false;
            if(fiveb==true){
                if(two<five){
                    return two;
                }
                else{
                    return five;
                }
            }
            else{
                if(two<six){
                    return two;
                }
                else{
                    return six;
                }
            }
        }
        if(four<two){
            twob=false;
            if(fiveb==true){
                if(four<five){
                    return four;
                }
                else{
                    return five;
                }
            }
            else{
                if(four<six){
                    return four;
                }
                else{
                    return six;
                }
            }
        }    
    }
    return 0;
}  




}

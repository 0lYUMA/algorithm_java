package Level_1;

public class PYnum {
    boolean main(String s) {
        boolean answer = true;
        int pNum = 0, yNum = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            String alphabet = s.substring(i, i+1);
            
            if (alphabet.equals("p") || alphabet.equals("P")) pNum++;
            else if (alphabet.equals("y") || alphabet.equals("Y")) yNum++;
        }
        
        if (pNum == 0 && yNum == 0) answer = true;
        else if (pNum == yNum) answer = true;
        else answer = false;

        return answer;
    }
}
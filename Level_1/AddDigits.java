package Level_1;

import java.util.*;

public class AddDigits {
    public int main(int n) {
        int answer = 0;
        
        String num = String.valueOf(n);
                
        for (int i = 0; i < num.length(); i++)
        {
            int parseNum = Integer.parseInt(num.substring(i, i+1));
            answer = answer + parseNum;
        }

        return answer;
    }
}
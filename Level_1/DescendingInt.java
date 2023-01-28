package Level_1;

import java.util.Arrays;

public class DescendingInt {
    public long main(long n) {
        long answer = 0;
        
        String nString = String.valueOf(n);
        char[] chArray = new char[nString.length()];
        
        for (int i = 0; i < nString.length(); i++)
        {
            chArray[i] = nString.charAt(i);
        }
        
        Arrays.sort(chArray);
        
        String sortNum = "";
        
        for (int j = nString.length() - 1; j >= 0; j--)
        {
            sortNum += chArray[j];
        }
        
        answer = Long.parseLong(sortNum);
        
        return answer;
    }
}

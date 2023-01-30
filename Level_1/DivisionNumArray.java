package Level_1;

import java.util.Arrays;

public class DivisionNumArray {
    public int[] main(int[] arr, int divisor) {
        int[] answer;
        int arrNum = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % divisor == 0) arrNum++;
        }
        
        if (arrNum == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            answer = new int[arrNum];
        
            int answerNum = 0;
        
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] % divisor == 0)
                {
                    answer[answerNum] = arr[j];
                    answerNum++;
                }
            }
        
            Arrays.sort(answer);
        }
        
        return answer;
    }
}

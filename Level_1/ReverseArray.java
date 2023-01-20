package Level_1;

public class ReverseArray {
    public int[] main(long n) {
        int[] answer = {};
        int k = 1;
        long num = n;
        
        while(true)
        {
            if (n < 10) break;
            n = n / 10;
            k++;
        }
        
        answer = new int[k];
        
        for (int i = 0; i < k; i++)
        {
            answer[i] = (int)(num % 10);
            num = num / 10;
        }
        
        return answer;
    }
}
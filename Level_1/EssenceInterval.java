package Level_1;

public class EssenceInterval {
    public long main(int a, int b) {
        long answer = 0;
        
        if (a == b) answer = a;
        else if (a < b)
        {
            for (int i = a; i <= b; i++)
            {
                answer += i;
            }
        }
        else
        {
            for (int j = a; j >= b; j--)
            {
                answer += j;
            }
        }
        
        return answer;
    }
}

package Level_1;

public class Remainder1 {
    public int main(int n) {
        int answer = 0;
        
        for (int i = 1; i < n; i++)
        {
            if (n % i == 1)
            {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}

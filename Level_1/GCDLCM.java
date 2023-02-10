package Level_1;

public class GCDLCM {
    public int[] main(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수
        for (int i = 2; i <= n; i++)
        {
            if (n % i == 0 && m % i ==0) answer[0] = i;
        }
        
        if (answer[0] == 0) answer[0] = 1; // 최대공약수가 1일 경우
        
        // 최소공배수
        if (answer[0] == 1)
        {
            answer[1] = n * m;
        }
        else
        {
            answer[1] = n * m / answer[0];
        }
        
        return answer;
    }
}

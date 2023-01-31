package Level_1;

public class NoneNum {
    public int main(int[] numbers) {
        int answer = 45;
        
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (numbers[i] == j) answer -= j;
            }
        }
        
        return answer;
    }
}

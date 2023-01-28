package Level_1;

public class Collatz {
    public int main(int num) {
        int answer = 0;
        long longnum = (long)num;
        
        if (num == 1) answer = 0;
        
        else {
            do {
                if (longnum % 2 == 0) {
                    longnum /= 2;
                    answer++;
                }
                else {
                    longnum = longnum * 3 + 1;
                    answer++;
                }
            
                if (answer >= 500) {
                    answer = -1;
                    break;
                }
            } while (longnum != 1);
        }
        
        return answer;
    }
}

package Level_1;

public class StringtoInt {
    public int main(String s) {
        int answer = 0;
        
        String ifNegative = s.substring(0, 1);
        
        if (ifNegative == "-")
        {
            answer = Integer.parseInt(s.substring(1, s.length())) * -1;
        }
        else
        {
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}

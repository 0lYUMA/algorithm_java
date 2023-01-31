package Level_1;

public class MiddleLetter {
    public String main(String s) {
        String answer = "";
        int sLength = s.length();

        if (sLength % 2 == 1)
        {
            answer += s.charAt(sLength / 2);
        }
        else
        {
            answer += s.charAt(sLength / 2 - 1);
            answer += s.charAt(sLength / 2);
        }
        
        return answer;
    }
}

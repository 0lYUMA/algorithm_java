package Level_1;

public class KimInSeoul {
    public String main(String[] seoul) {
        String answer = "";
        int seq = 0;
        
        for (int i = 0; i < seoul.length; i++)
        {
            if (seoul[i].equals("Kim")) seq = i;
        }
        
        answer = "김서방은 " + seq + "에 있다";
        
        return answer;
    }
}

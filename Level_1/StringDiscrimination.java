package Level_1;

public class StringDiscrimination {
    public boolean main(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6)
        {
            try {
                Integer.parseInt(s);
                answer = true;
            } catch (NumberFormatException ex) {
                answer = false;
            }
        }
        else answer = false;
            
        return answer;
    }
}

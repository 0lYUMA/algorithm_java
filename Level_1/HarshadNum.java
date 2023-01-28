package Level_1;

public class HarshadNum {
    public boolean main(int x) {
        boolean answer = true;
        int hap = 0;
        
        String xString = String.valueOf(x);
        
        for (int i = 0; i < xString.length(); i++)
        {
            hap += Integer.parseInt(xString.substring(i, i+1));
        }
        
        if (x % hap != 0) answer = false;
        
        return answer;
    }
}

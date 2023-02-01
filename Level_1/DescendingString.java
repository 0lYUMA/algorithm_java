package Level_1;

import java.util.Arrays;
import java.util.Collections;

/*
 * Collections 클래스 : 컬렉션에서 작동 or 반환하는 정적 메소드로만 구성
 * -> reverse() 메서드, reverseOrder() 메서드, sort() 메서드
 */

public class DescendingString {
    public String main(String s) {
        String answer = "";
        String[] sArray = new String[s.length()];
        
        for (int i = 0; i < s.length(); i++)
        {
            sArray[i] = s.substring(i, i+1);
        }
        
        Arrays.sort(sArray, Collections.reverseOrder());
        
        for(int j = 0; j < sArray.length; j++)
        {
            answer += sArray[j];
        }
        
        return answer;
    }
}

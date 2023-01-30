package Level_1;

public class PhoneNumber {
    public String main(String phone_number) {
        String answer = "";
        
        /* Java 11에서 repeat 함수 사용 가능 */
        /* answer = "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4); */

        for (int i = 0; i < phone_number.length(); i++)
        {
            if (i < phone_number.length() - 4) answer += "*";
            else answer += phone_number.charAt(i);
        }

        return answer;
    }
}

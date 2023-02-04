package Level_1;

public class UsageFee {
    public long main(int price, int money, int count) {
        long answer = -1;
        long usageFee = 0;
        
        for (int i = 1; i <= count; i++)
        {
            usageFee += i * price;
        }
        
        if (money < usageFee) answer = usageFee - money;
        else answer = 0;

        return answer;
    }
}

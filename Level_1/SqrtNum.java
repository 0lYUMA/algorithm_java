package Level_1;

class sqrtNum {
    public long main(long n) {
        long answer = 0;
        
        long sqrtNum = (long)Math.sqrt(n);
        
        if (sqrtNum * sqrtNum == n)
        {
            answer = (sqrtNum + 1) * (sqrtNum + 1);
        }
        else answer = -1;
        
        return answer;
    }
}
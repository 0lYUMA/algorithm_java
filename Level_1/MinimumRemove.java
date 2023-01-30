package Level_1;

public class MinimumRemove {
    public int[] main(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        
        else
        {
            int min = arr[0];
            
            for (int i = 0; i < arr.length; i++)
            {
                if (min > arr[i]) min = arr[i];
            }
            
            int index = 0;
            answer = new int[arr.length - 1];
            
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] == min)
                {
                    continue;
                }
                
                answer[index++] = arr[j];
            }
        }
        
        return answer;
    }
}

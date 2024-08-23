import java.util.Arrays;

public class Activity {
        public static void main(String[] args) {
        char[] Activity = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[] startTimes = {2, 1, 3, 4, 3, 2, 6};
        int[] finishTimes = {3, 4, 5, 6, 7, 4, 7};

        for (int i = 0; i < Activity.length - 1; i++) {
             for(int j= 0; j< Activity.length -1 -i; j++)


             if(finishTimes[j]>finishTimes[j+1]) {
                int temp = finishTimes[j];
                finishTimes[j] = finishTimes[j+1];
                finishTimes[j+1] = temp;


               
                    int temp2 = startTimes[j];
                    startTimes[j] = startTimes[j+1];
                    startTimes[j+1] = temp2;


                    char  temp3 = Activity[j];
                    Activity[j] = Activity[j+1];
                    Activity[j+1] = temp3;




                    

                 }
             
              


             }
             System.out.println("Activity: "+ Arrays.toString(Activity));
             System.out.println("finishTimes: "+ Arrays.toString(finishTimes));
        
              System.out.println("startTimes: "+ Arrays.toString(startTimes));

        }
    }
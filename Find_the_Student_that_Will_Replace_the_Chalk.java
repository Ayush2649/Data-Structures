
public class Find_the_Student_that_Will_Replace_the_Chalk {
    public static int checkReplacer(int[] chalk, int k){
        int n = chalk.length;

        long totalChalksNeeded = 0;
        for(int chalksRequired : chalk){
            totalChalksNeeded += chalksRequired;
        }

        int remainingChalks = (int) (k % totalChalksNeeded);
        for(int i = 0; i < n; i++){
            if(remainingChalks < chalk[i]){
                return i;
            }
            remainingChalks -= chalk[i];
        }

        return -1;
    }

    public static void main(String args[]){
        int[] chalk = {5, 1, 5};
        int k = 22;
        System.out.println(checkReplacer(chalk, k));
    }
}

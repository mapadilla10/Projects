import java.util.Scanner;
public class CSAutomata{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);  //init Scanner for user input
        System.out.println("Please enter the number of states.");
        int N = input.nextInt();
        System.out.println("Please enter the number of symbols.");
        int M = input.nextInt();
        int [][] state = new int [N][M];
        boolean [] isfinal = new boolean [N];
        for (int n = 0; n< N; n++){
            for (int m = 0; m<M ;m++){
                System.out.println("What state do you want to move to if you are in state "+n+" and you read the symbol "+m+"?");
            state[n][m] = input.nextInt();
            }
        }
        for (int f=0;f<N;f++){
            System.out.println("Is state # "+f+" final? enter 1 for yes and 0 for no.");
            int num = input.nextInt();
            isfinal[f]= num !=0;
        }
        System.out.println("How long is the word? ");
        int i = input.nextInt();
        int [] word = new int [i];
        System.out.println("Please enter the word.");
        for (int j=0 ; j<i ; j++){
            word[j] = input.nextInt();
        }
        int currentState = 0;
        for (int k=0; k< word.length;k++){
            currentState = state[currentState][word[k]];
        }
        if (isfinal[currentState]){
            System.out.println("true");
        }
        else{
            System.out.println("false");           
        }
    }
}


// need to close scanner

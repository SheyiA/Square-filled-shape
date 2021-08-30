import java.util.Scanner;

public class SquareFilled {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the symbol: ");
        char c = sc.next().charAt(0);
        for(int i = 0; i <n; i++){
            for(int j=0;j<n;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

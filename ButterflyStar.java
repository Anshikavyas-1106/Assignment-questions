import java.util*;
public class ButterflyStar {
    public static void printPattern(int n) 
{
    for(int i = 1; i<=n; i++)
    for(int j = 1; j<=2*n-1;j++)
    if (j>i && j <=2*n-1) {
        System.out.println(" ");

    }
    else{
        System.out.println();
    }
    for(int i = n; i>=1;i--)
    for(int j=1;j<=2*n;j++) {
        if (j > i && j<=2*n-1) {
            System.out.print("");

        }
        else {
            System.out.print("*");
        }
    }
    System.out.println();
}
}
    public static void main(String[] args) {
        
        int n = 6;
        printPattern(n);
        
    }
}
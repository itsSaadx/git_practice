public class Pattern8 {
    public static void main(String[] args) {
        int n = 8;
        int sp=n-1;
        int star=1;

        for (int r=1; r<= n; r++) {
            for (int s = 1; s<=sp; s++) {
                System.out.print(" ");
            }
            for(int st=1; st<=star; st++){
            System.out.println("*");
            }
            sp--;
            System.out.println();
        }
    }
}
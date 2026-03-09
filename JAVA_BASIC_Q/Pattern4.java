
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int sp = n - n;

        for (int r = 1; r <= n; r++) {

            for (int s = 1; s <= sp; s++) {
                System.out.print("\t");

            }

            for (int c = 1; c <= star; c++) {
                System.out.print("*"); // we can make it reverse triangle by adding space "* " like this
            }

            star--;
            sp++;
            System.out.println();

        }
    }
}


// same solution by pepcoding
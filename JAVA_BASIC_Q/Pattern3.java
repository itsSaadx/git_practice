

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n - 1;
        int star = 1;

        for (int r = 1; r <= n; r++) {
            // print spaces
            for (int c = 1; c <= sp; c++) {
                System.out.print("\t");
            }

            // print star
            for (int s = 1; s <= star; s++) {
                System.out.print("\t*"); // we can make it triangle by adding space "* " like this
            }

            sp--;
            star++;
            System.out.println();
        }
    }
}

// same solution by pepcoding


public class Pattern5 {
    public static void main(String[] args) {
      int n = 10; // it will work on any number
int star = 1;
int space = n / 2;

for (int row = 1; row <= n; row++) {
    for (int s = 1; s <= space; s++) {
        System.out.print(" ");
    }
    for (int st = 1; st <= star; st++) {
        System.out.print("*");
    }
    System.out.println();

    if (row <= n / 2) {
        space--;
        star += 2;
    } else {
        space++;
        star -= 2;
    }
}

    }
} 


// pepcoding solution same;




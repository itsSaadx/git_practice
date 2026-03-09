
import java.util.Scanner;

// original place → op (original position)
// original digit → od
// inverse position → invp
// inverse digit → invd

class inversenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        
        int inum = 0; // final inverse number
        int op = 1;   // original position

        while (num != 0) {
            int od = num % 10; // extract original digit

            int invp = od;     // digit becomes position
            int invd = op;     // position becomes digit

            // Apply main formula
            inum = inum + invd * (int) Math.pow(10, invp - 1);

            num = num / 10; // reduce the number
            op++;           // increase the position
        }

        System.out.println("Inverse number is: " + inum);
    }
}




//  Example Working Table (for number 2134):
// op (Position)	od (Digit)	invp	invd	Formula used	inum (Running Total)
// 1	4	4	1	1 * 10^(4-1) = 1000	1000
// 2	3	3	2	2 * 10^(3-1) = 200	1200
// 3	1	1	3	3 * 10^(1-1) = 3	1203
// 4	2	2	4	4 * 10^(2-1) = 40	1243

// public class Pattern7 {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int r = 1; r <= n; r++) {
//             for (int s = 1; s < r; s++) {
//                 System.out.print(" ");
//             }
//             System.out.println("*");
//         }
//     }
// }



// pep coding solution

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <=n; s++) {
                if(r==s){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
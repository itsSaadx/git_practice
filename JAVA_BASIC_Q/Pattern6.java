// public class Pattern6 {

//     public static void main(String[] args) {
//         int star=3;
//          int n=5;
//         int sp=n/2;
       

//         for(int r=1; r<=n; r++){
//             for(int c=1; c<=star; c++){
//                 System.out.print("*");
//             }
//             for(int s=1; s<=sp; s++){
//                 System.out.print(" ");
//             }
//             for(int st=1; st<=star; st++){
//                 System.out.print("*");
//             }

//             if(r<=n/2){
//             star--;
//             sp+=2;
//             }
//             else{
//                 star++;
//                 sp-=2;
//             }
//                 System.out.println();
//         }

//     }
// }



//pepcoding solution

public class Pattern6 {

    public static void main(String[] args) {
         int n=7;
        int star=n/2+1;                                              // updating the row star according to the number n
        int sp=1;
       

        for(int r=1; r<=n; r++){
            for(int c=1; c<=star; c++){
                System.out.print("*\t");
            }
            for(int s=1; s<=sp; s++){
                System.out.print("\t");
            }
            for(int st=1; st<=star; st++){
                System.out.print("*\t");
            }

            if(r<=n/2){
            star--;
            sp+=2;
            }
            else{
                star++;
                sp-=2;
            }
                System.out.println();
        }

    }
}

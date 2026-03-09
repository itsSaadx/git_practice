
public class Pattern2 {    
    // reverse pattern
    public static void main(String []args){
        int n=5; 
        for(int r=n ; r>=1; r--){
            for(int c=r; c>=1 ; c--){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}



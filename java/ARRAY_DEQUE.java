// import java.util.*;
// public class ARRAY_DEQUE extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.addLast(5);
//         ad1.offerLast(10);
        
//         System.out.println(ad1);

// }
// }


// import java.util.*;
// public class ARRAY_DEQUE extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.add(10);
//         ad1.add(91);
//         ad1.add(19);

//         System.out.println(ad1.getFirst()); // both fuction are same works
//         System.out.println(ad1.peekFirst());

// }
// }




import java.util.ArrayDeque;

public class ARRAY_DEQUE {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
}
}
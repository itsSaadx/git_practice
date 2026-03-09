class paractice5 {
    // 5 floar program //
    public static void main(String[] args) {
         float sum=0;
        float flatarray[] = {1.2f, 1.3f, 4.5f, 5.5f, 6.5f};
        for (int i = 0; i < 5; i++) {
            System.out.println(flatarray[i] + " ");
             sum += flatarray[i];
        }

        System.out.println("the sum of float numbers " + sum);
    }
}


// FIND INTERGER IN AN ARRAY (p2)

// class paractice5 {
//     public static void main(String [] args){

    
//     int arr [] = {2,3,4,5,6};
//     System.out.println("check 5 is present in an array or not");
//     for(int i=0; i<arr.length ; i++){
//         if(arr[i]==5){
//             System.out.println("the element FIND : " + arr[i]);
//             System.out.println("5 is present in an array");
//             break;
//         }
//     }
// }

// public static void main(String [] args){

//     float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//         float num = 45.57f;
//         boolean isInArray = false;
//         for(float element:marks){
//             if(num==element){
//                 isInArray = true;
//                 break;
//             }
//         }
//         if(isInArray){
//             System.out.println("The value is present in the array");
//         }
//         else{
//             System.out.println("The value is not present in the array");
//         }

// }
//}


// p(3)

// class paractice5 {
//     public static void main(String [] args){
// float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//         float sum = 0;
//         for(float element:marks){
//             sum = sum + element;
//         }
//         System.out.println("The value of average marks is " + sum/marks.length);

//     }
// }


// p(4)

// class paractice5 {
//     public static void main(String [] args){
//         int [][] mat1 = {{1, 2, 3},
//                          {4, 5, 6}};
//         int [][] mat2 = {{2, 6, 13},
//                          {3, 7, 1}};
//         int [][] result = {{0, 0, 0},
//                            {0, 0, 0}};

//         for (int i=0;i<mat1.length;i++){ // row number of times
//             for (int j=0;j<mat1[i].length;j++) { // column number of time
//                 System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//         }

//         // Printing the elements of a 2-D Array
//         for (int i=0;i<mat1.length;i++){ // row number of times
//             for (int j=0;j<mat1[i].length;j++) { // column number of time
//                 System.out.print(result[i][j] + " ");
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//             System.out.println(""); // Prints a new line
//         }
// }
// }


// (p5)


// class paractice5 {
//   public static void main(String[] args){
//     int arr [] = {1,2,3,4,5,6};
//     int l = arr.length;
//     int temp;
//     int n = Math.floorDiv(l,2); // this function always return interger vlaue 
//       for(int i = 0; i<n ; i++){
//       // swap a[i] and a[l-1-i] this is the logic
//       temp = arr[i];
//       arr[i] = arr[l-i-1];
//       arr[l-i-1] = temp;
//       }

//       // for each loop
//       for(int element: arr){
//         System.out.print(element + " ");
//       }
//   }
// }

// p(5) >>  maximmum element

// class paractice5{
//   public static void main(String [] args){
//     int arr [] ={1,23,33,555,4,3,2};
//     int max = 0; // we can use minnimum and maximum in max variable like this (max = integer.minimmum),(max = interger.maximmum)
//     for(int i=0; i<arr.length; i++){
//       if(max<arr[i]){
//         max = arr[i];
//       }
//       }
//       System.out.println("the maximum element of the array: " + max);
//   }
// }

 //minimmum value
// class paractice5{
//   public static void main(String [] args){
//     int arr [] ={-3,1,23,33,-10,555,4,3,2};
//     int max = Integer.MAX_VALUE; //  (max = Integer.MAX_VALUE),(max = Integer.MIN_VALUE) >> IT SETS VALUE MAXIMMUM AND MINIMMUM FOR INTEGER VARIABLES
//     for(int i=0; i<arr.length; i++){
//       if(max>arr[i]){
//          max = arr[i];
//       }
//       }
//       System.out.println("the maximum element of the array: " + max);
//   }
// }

// P(6) >> ARRAY SORTED OR NOT

// class paractice5{
//   public static void main(String[] args){
//       boolean isSorted = true;
//         int [] arr = {1, 12, 3, 4, 5, 34, 67};
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i] > arr[i+1]){
//                 isSorted = false;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("The Array is sorted");
//         }
//         else{
//             System.out.println("The Array is not sorted");
// }
// }
// }
// package 4_Class;

// public class index {
//     public static void main(String[] args) {
//         2D Array Questions with Solutions - Java
//  1. Matrix Print (2D array ko print karo)
//  int[][] arr = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
//  };
//  for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//         System.out.print(arr[i][j] + " ");
//     }
//     System.out.println();
//  }
//  2. Sum of All Elements (Poore matrix ka sum nikaalo)
//  int sum = 0;
//  for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//         sum += arr[i][j];
//     }
//  }
//  System.out.println("Total Sum: " + sum);
//  3. Row-wise Sum (Har row ka sum print karo)
//  for (int i = 0; i < arr.length; i++) {
//     int rowSum = 0;
//     for (int j = 0; j < arr[i].length; j++) {
//         rowSum += arr[i][j];
//     }
//     System.out.println("Sum of Row " + i + ": " + rowSum);
//  }
//  4. Column-wise Sum (Har column ka sum print karo)
//  for (int j = 0; j < arr[0].length; j++) {
//     int colSum = 0;
//     for (int i = 0; i < arr.length; i++) {
//         colSum += arr[i][j];
//     }
//     System.out.println("Sum of Column " + j + ": " + colSum);
//  }
//  5. Maximum Element (Matrix ka sabse bada element find karo)
//  int max = arr[0][0];
//  for (int i = 0; i < arr.length; i++) {
// 2D Array Questions with Solutions - Java
//     for (int j = 0; j < arr[i].length; j++) {
//         if (arr[i][j] > max) {
//             max = arr[i][j];
//         }
//     }
//  }
//  System.out.println("Maximum element: " + max);
//  6. Minimum Element (Matrix ka sabse chhota element find karo)
//  int min = arr[0][0];
//  for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//         if (arr[i][j] < min) {
//             min = arr[i][j];
//         }
//     }
//  }
//  System.out.println("Minimum element: " + min);
//     }
// }

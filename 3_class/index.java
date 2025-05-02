// package 3_class;

// public class index {
//     public static void main(String[] args) {
//         Java Array Practice Questions with Solutions
//  Q1. Sum of All Elements
//  Ek array lo user se input me, aur uske sare elements ka sum nikaalo.
//  import java.util.Scanner;
//  public class SumArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int sum = 0;
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }
//         System.out.println("Sum = " + sum);
//     }
//  }
//  Q2. Find Maximum Element
//  Array me sabse bada element kaunsa hai, wo print karo.
//  import java.util.Scanner;
//  public class MaxElement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("Maximum element: " + max);
//     }
//  }
// Q3. Count Even and Odd Numbers
//  Array ke andar kitne even aur odd numbers hain, uska count nikaalo.
//  import java.util.Scanner;
//  public class EvenOddCount {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int even = 0, odd = 0;
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             if (arr[i] % 2 == 0)
//                 even++;
//             else
//                 odd++;
//         }
//         System.out.println("Even: " + even + ", Odd: " + odd);
//     }
//  }
//  Q4. Linear Search
//  User se ek number lo, aur check karo wo number array me hai ya nahi.
//  import java.util.Scanner;
//  public class LinearSearch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter number to search: ");
//         int x = sc.nextInt();
//         boolean found = false;
//         for (int val : arr) {
//             if (val == x) {
//                 found = true;
//                 break;
//             }
//         }
//         if (found)
//             System.out.println(x + " is present in the array.");
//         else
//             System.out.println(x + " is not present in the array.");
//     }
//  }
//  Q5. Reverse the Array
//  Array ke elements ko reverse order me print karo.
//  import java.util.Scanner;
//  public class ReverseArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Reversed array:");
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//  }
//     }
// }

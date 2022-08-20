import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        int[] spendingByDay = generateArray();

        System.out.println("Task 1:");
        int spendingPerMonth = 0;
        for (int i : spendingByDay) {
            spendingPerMonth += i;
        }
        System.out.println("The amount spent per month was " + spendingPerMonth + " rubles");

        System.out.println("\nTask 2:");
        int minWaste = 200_000;
        int maxWaste = 0;
        for (int x : spendingByDay) {
            minWaste = Math.min(x, minWaste);
            maxWaste = Math.max(x, maxWaste);
        }
        System.out.println("The minimum amount of spending per day was " + minWaste + " rubles. " +
                "The maximum amount of spending per day was " + maxWaste + " rubles.");

        System.out.println("\nTask 3:");
        double averageWaste = (double) spendingPerMonth/spendingByDay.length;
        System.out.printf("The average amount spent per month was %.2f rubles\n", averageWaste);

        System.out.println("\nTask 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println("\n\nTask 5:");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i == j ? 1 : 0;
            }
        }
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 6:");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] buffer = new int[5];
        for (int i = arr.length - 1; i >= 0; i--) {
            buffer[buffer.length-1 - i] = arr[i];
        }
        arr = buffer;
        System.out.println(Arrays.toString(arr));

        System.out.println("\nTask 7:");
        int[] newArr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(newArr));
        int len = newArr.length;
        for (int i = 0; i < len/2; i++) {
            newArr[i] +=  newArr[len-1 - i];
            newArr[len-1 - i] = newArr[i] - newArr[len-1 - i];
            newArr[i] -= newArr[len-1 -i];
        }
        System.out.println(Arrays.toString(newArr));

        System.out.println("\nTask 8:");
        int[] arrTask8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean numsFounded = false;
        Arrays.sort(arrTask8);
        for (int i = 0; i < arrTask8.length; i++) {
            for (int j = i; j < arrTask8.length; j++) {
                if (arrTask8[i] + arrTask8[j] > -2) {
                    break;
                } else if (arrTask8[i] + arrTask8[j] == -2) {
                    System.out.printf("Desired numbers: %d and %d\n", arrTask8[i], arrTask8[j]);
                    numsFounded = true;
                    break;
                }
            }
            if (numsFounded) {
                break;
            }
        }

        System.out.println("\nTask 9:");
        int[] arrTask9 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arrTask9);
        for (int i = 0; i < arrTask9.length; i++) {
            for (int j = i; j < arrTask9.length; j++) {
                if (arrTask9[i] + arrTask9[j] > -2) {
                    break;
                } else if (arrTask9[i] + arrTask9[j] == -2) {
                    System.out.printf("New matching pair: %d and %d\n", arrTask9[i], arrTask9[j]);
                }
            }
        }
    }

    private static int[] generateArray(){
        int[] a = new int[30];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (100_000*(Math.random() + 1));
        }

        return a;
    }
}

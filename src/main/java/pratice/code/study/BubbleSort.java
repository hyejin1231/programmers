package pratice.code.study;

import java.util.Arrays;

// 버블정렬 
public class BubbleSort {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
         }

        for (int i = 0; i < num.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[i] = num[j + 1];
                    num[j + 1] = temp;
                    changed = true;
                }
            }

            if (!changed) break;
        }

        Arrays.stream(num).forEach(i -> System.out.print(i + " "));
    }
}

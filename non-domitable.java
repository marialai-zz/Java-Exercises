// Task: Find the number of non-domitable entities
// Entity A (x1y1) dominates entity B (x2y2) when x1 > x2 && y1 > y2
// Read from input stream for a list of domitable entities with x and y components
// First int from stream is the number of entities in list
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int[] xArray = new int[lines];
        int[] yArray = new int[lines];
        for (int l = 0; l < lines; l++) {
            xArray[l] = sc.nextInt();
            yArray[l] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < lines; i++) {
            boolean dominated = false;
            for (int j = 0; j < lines; j++) {
                if (i == j) {
                    continue;
                }
                if (xArray[i] < xArray[j] && yArray[i] < yArray[j]) {
                    dominated = true;
                    break;
                }
            }
            if (!dominated) {
                count++;
            }
        }

        System.out.println(count);
    }
}
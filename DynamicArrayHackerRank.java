// Using a Dynamic Array
// https://www.hackerrank.com/challenges/dynamic-array/submissions/code/23494383

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int lastAns = 0;
        ArrayList<ArrayList> seqList = new ArrayList<ArrayList>();
        for (int i = 0; i < n; i++) {
            seqList.add(i, new ArrayList<Integer>());
        }
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int index = (x ^ lastAns) % n;
            ArrayList<Integer> seq = seqList.get(index);
            int size = seq.size();
            
            switch (type) {
                case 1:
                    seq.add(size, y);
                    break;
                case 2:
                    int element = y % size;
                    lastAns = seq.get( element );
                    System.out.println( lastAns );
                    break;
                default:
                    System.out.println( "Invalid type of query." );
                    break;
            }
        }
    }
}
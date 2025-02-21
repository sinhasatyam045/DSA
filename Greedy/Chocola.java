package Greedy;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Chocola {

    public static void main(String args[]) {
        int n = 4;
        int m = 6;
        Integer costhor[] = { 4, 1, 2 };
        Integer costvert[] = { 2, 1, 3, 1, 4 };
        int v;
        int h;
        int vp = 1;
        int hp = 1;
        int cost = 0;
        Arrays.sort(costvert, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());
        while (h < costhor.length && v < costvert.length) {
            if (costvert[v] <= costhor[h]) {
                cost += vp * costhor[h];
                hp++;
                h++;
            } else {
                cost += hp * costvert[v];
                vp++;
                v++;
            }

        }
        while (h < costhor.length) {
            cost += vp * costhor[h];
            hp++;
            h++;
        }
        while (v < costvert.length) {
            cost += hp * costvert[v];
            vp++;
            v++;
        }
        System.out.print("Minimum cost: " + cost);

    }

}

package Greedy;

public class Knapsack {
    static void knapSack(int value[], int weight[], int capacity) {
        int[] ratio=new int[value.length];
        for (int i = 0; i < value.length; i++) {
            ratio[i] = value[i] / weight[i];
        }
        for(int i=0;)
    }

    public static void main(String args[]) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;
        knapSack(value, weight, capacity);
    }

}

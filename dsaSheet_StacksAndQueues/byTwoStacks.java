package dsaSheet_StacksAndQueues;

public class byTwoStacks {
    int arr[];
    int size;
    int top1, top2;

    byTwoStacks(int n) {
        arr = new int[n];
        size = n;
        int top1 = -1;
        int top2 = size;

    }

    void push1(int data) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = data;

        } else {
            System.out.println("Stack overflow");
            System.out.print(arr);
        }

    }

    void push2(int data) {
        if (top1 + 1 < top2) {
            top2--;
            arr[top2] = data;
        } else {
            System.out.print("Stack overflow");
            System.out.print(arr);

        }

    }

    int pop1() {
        if (top1 >= 0) {
            int data = arr[top1];
            top1--;
            return data;
        } else {
            System.out.print("Stack Underflow");
        }
        return 0;

    }

    int pop2() {
        if (top2 < size) {
            int data = arr[top2];
            top2++;
            return data;
        } else {
            System.out.print("Stack Underflow");

        }
        return 0;

    }

    public static void main(String args[]) {
        byTwoStacks bts = new byTwoStacks(5);
        bts.push1(1);
        bts.push2(2);
        bts.push1(3);
        bts.push2(4);
        bts.push1(5);

    }

}

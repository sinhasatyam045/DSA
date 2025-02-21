package Queues;

public class CircularArray {
    static class Queue {
        static int arr[];
        static int rear;
        static int size;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front; // if updated rear==full
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
            }
            if (front == -1) { // if first elemnet is being inserted ,we have to update front also.
                front = 0;

            }
            rear = (rear + 1) % size; // Updating rear
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) { // if last element is being deleted.
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];

        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}

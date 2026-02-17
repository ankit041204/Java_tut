import java.util.*;
class QueueUsingArrEx{
    int arr[];
    int size;
    int rear;
    // Constructor
    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    public void display() {
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();
    }
}

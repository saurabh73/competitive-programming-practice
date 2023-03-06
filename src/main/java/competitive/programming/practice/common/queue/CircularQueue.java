package competitive.programming.practice.common.queue;

public class CircularQueue {
    private final int capacity;
    private final int[] queueArray;
    int rear;
    int front;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[this.capacity];
        this.rear = 0;
        this.front = 0;
    }

    public CircularQueue(int capacity, int[] arr) {
        this.capacity = capacity;
        this.queueArray = new int[this.capacity];

        if (arr.length <= this.capacity) {
            System.arraycopy(arr, 0, this.queueArray, 0, arr.length);
            this.front = 0;
            this.rear = arr.length - 1;
        }
    }

    public boolean isFull() {
        int diff = this.rear - this.front;
        return (diff == -1) || (diff == this.capacity - 1);
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public void enqueue(int val) {
        if (!isFull()) {
            this.rear = (this.rear + 1) % this.capacity;
            this.queueArray[this.rear] = val;

        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            //System.out.println("dequeue: "+this.queueArray[this.front]);
            this.front = (this.front + 1) % this.capacity;
        }
    }

    public int size() {
        if (this.rear > this.front) {
            return (this.rear - this.front + 1);
        } else {
            return (this.capacity - (this.front + this.rear));
        }
    }

    public int frontElement() {
        if (!isEmpty()) {
            return this.queueArray[this.front];
        }
        return -1;
    }
}
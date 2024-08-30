class customQueue{
    int[] queue;
    int maxSize;
    int size;

    public customQueue(int maxSise){
        this.maxSize = maxSise;
        this.queue = new int[maxSize];
        this.size = 0;
    }

    public boolean enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full. Cannot enqueue.");
            return false;
        }
        queue[size] = value;
        size++;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = queue[0];
        for(int i = 0; i < size - 1; i++){
            queue[i] = queue[i+1];
        }
        size--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queue[0];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull(){
        return size == maxSize;
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if(i == size - 1){
                System.out.print(queue[i]);
            } else  {
                System.out.print(queue[i] + ", ");
            }
        }
        System.out.println("]");
    }
}

public class queueImplementation {
    public static void main(String[] args) {
        customQueue queue = new customQueue(10);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}

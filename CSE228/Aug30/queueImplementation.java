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
        queue[size] = value;
        size++;
        return true;
    }

    public int dequeue(){
        int value = queue[0];
        for(int i = 0; i < size - 1; i++){
            queue[i] = queue[i+1];
        }
        size--;
        return value;
    }

    public int peek(){
        return queue[0];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull(){
        return size == maxSize;
    }

    public void print(){
        
    }
}

public class queueImplementation {
    public static void main(String[] args) {
        customQueue queue = new customQueue(10);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Queue peek: " + queue.peek());
    }
}

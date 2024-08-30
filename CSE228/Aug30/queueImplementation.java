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
}

public class queueImplementation {
    public static void main(String[] args) {
        
    }
}

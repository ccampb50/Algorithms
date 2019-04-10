public class LongQueue{
    //Queue implemented with an array along with using Long Data Type

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int numberOfElements;

    public LongQueue(int size){
        maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        numberOfElements = 0;
    }

    public void insert(long data){
        if(rear == maxSize -1)
            rear = -1;
        queueArray[++rear] = data;
        numberOfElements++;
    }
    
    public long remove(){
        long temp = queueArray[front++];
        if(front == maxSize)
            front = 0;
        numberOfElements--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (numberOfElements == 0);
    }

    public boolean isFull(){
        return (numberOfElements==maxSize);
    }

    public int size(){
        return numberOfElements;
    }

    public static void main(String[] args){

        LongQueue longQ = new LongQueue(10);
        longQ.insert(100);
        longQ.insert(50);
        longQ.insert(60);
        longQ.insert(75);
        longQ.insert(80);
        longQ.insert(90);

        longQ.remove();
        longQ.remove();

        while(!longQ.isEmpty()){
            System.out.print(longQ.remove() + " ");
        }

    }
}
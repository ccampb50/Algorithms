class PriorityQueue{

    private int maxSize;
    private long[] queueArray;
    private int numberOfElements;

    public PriorityQueue(int size){
        maxSize = size;
        queueArray = new long[maxSize];
        numberOfElements = 0;
    }

    public void insert(long item){

        int i;

        if(numberOfElements==0){
            queueArray[numberOfElements++] = item;
        }

        else{
            for(i=numberOfElements-1; i>=0; i--){
                if(item > queueArray[i])
                    queueArray[i+1] = queueArray[i];
                else
                    break; 
            }
            queueArray[i+1] = item;
            numberOfElements++;
        }
      
    }

    public long remove(){
        return queueArray[--numberOfElements];
    }

    public long peakMin(){
        return queueArray[numberOfElements-1];
    }

    public boolean isEmpty(){
        return (numberOfElements==0);
    }

    public boolean isFull(){
        return (numberOfElements==maxSize);
    }

    public static void main(String[] args){

        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(50);
        priorityQueue.insert(10);
        priorityQueue.insert(40);
        priorityQueue.insert(20);

        while(!priorityQueue.isEmpty()){
            long data = priorityQueue.remove();
            System.out.print(data + ", ");
        }
    }

}
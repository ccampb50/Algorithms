public class LongStack{

    //an implementation of a stack using an array

    private int maxSize;
    private long[] stackArray;
    private int top;

    public LongStack(int size){
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1; // no items inserted yet 
    }

    public void push(long dataItem){
        stackArray[++top] = dataItem;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize -1);
    }

    public static void main(String[] args){
        LongStack myStack = new LongStack(10);

        myStack.push(50);
        myStack.push(605);
        myStack.push(100);
        myStack.push(200);
        myStack.push(43);
        myStack.push(34);
        myStack.push(21);
        myStack.push(23);
        myStack.push(245);
        myStack.push(123);

        while(!myStack.isEmpty()){
            System.out.print(myStack.pop() + " ");
        }

    }

}
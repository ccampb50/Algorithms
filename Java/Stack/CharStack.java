public class CharStack{
    
    private int maxSize;
    private char[] stackArr;
    private int top;

    public CharStack(int size){
        maxSize = size;
        stackArr = new char[maxSize];
        top = -1;
        }

    public void push(char c){
        stackArr[++top] = c;
    }
    
    public char pop(){
        return stackArr[top--];
    }

    public char peek(){
        return stackArr[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }
}
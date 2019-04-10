public class highInterfacedArray {

    private int[] arr;
    private int numOfElements;

    public highInterfacedArray(int size){
        arr = new int[size];
        numOfElements = 0; 
    }p

    public void insert(int data){
        
        if(numOfElements > arr.length){
            System.out.println("Cannot Insert More Elements Than Indexes");
            System.exit(0);
        }

        arr[numOfElements] = data;
        numOfElements++;
    }

    public void insert(int index, int data){
        //will replace a value

        if(index > arr.length){
            System.out.println("Cannot Insert More Elements Than Indexes");
            System.exit(0);
        }

        else if(index==arr.length){
            arr[index] = data;
        }
        else{
            arr[index] = data;
            numOfElements++;
        }
    }

    public void display(){
        for(int i=0; i<numOfElements; i++){
            System.out.println(arr[i]);
        }
    }

    public int getSize(){
        return arr.length;
    }

    public String toString(){
        String returned = "";
        for(int i = 0; i<numOfElements; i++){
            returned += String.valueOf(arr[i]) + " ";
        }
        return returned;
    }
    

    public static void main(String[] args){
        highInterfacedArray highArray = new highInterfacedArray(10);
        System.out.println(highArray.getSize());
        highArray.insert(99);
        highArray.insert(121);
        highArray.insert(12);
        highArray.insert(33);
        System.out.println(highArray.toString());
    }
}
public class ReverseWord{
    //reversing a word using a stack implementation

    private String inputString;
    private String outputString;

    public ReverseWord(String input){
        inputString = input; 
    }

    public String reverse(){
        int stackSize = inputString.length();
        CharStack stack = new CharStack(stackSize);

        for(int i = 0; i < inputString.length(); i++){
            char stringCharacter = inputString.charAt(i);
            stack.push(stringCharacter);
        }

        outputString = "";
        while(!stack.isEmpty()){
            outputString += stack.pop();
        }
        return outputString;
    }

    public static void main(String[] args){
        String inputWord = "Numerical";
        ReverseWord reverser = new ReverseWord(inputWord);
        System.out.println(inputWord + " backwards is " + reverser.reverse());
    }


}
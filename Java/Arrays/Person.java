public class Person{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String last, String first, int a){
        firstName = first;
        lastName = last;
        age = a;
    }

    public void displayPerson(){
        System.out.print("  Last Name: " + lastName);
        System.out.print(" First Name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName(){
        return lastName;
    }

    class PersonedArray{

        private Person[] pArray;
        private int nElements;
        public PersonedArray(int max){
            pArray = new Person[max];
            nElements = 0;
        }

        public Person find(String searchName){
            
            for(int i=0; i <nElems; i++){
                if(pArray[i].getLastName().equals(searchName))
                    return pArray[i];
                if(i==nElems){
                    return null;
                }   
        }
        return null;
        }
    }


    public static void main(String[] args){
        System.out.println("Test Works!");
    }

}
package illegal;

public class NumEgg {

    private void countPeople(int numOfPeople){
        if(numOfPeople < 0){
            throw new IllegalArgumentException("Number of people can't be negative");
        }
        System.out.println(numOfPeople);
    }

    public static void main(String[] args){
        new NumEgg().countPeople(6);
        new NumEgg().countPeople(-4);
    }
}

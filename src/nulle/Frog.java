package nulle;

public class Frog {
    public void hop(String name, Double jump){
        System.out.println(name.toUpperCase() + " " + jump.toString());
    }

    public static void main(String[] args){
       new Frog().hop("JJ", null);
    }
}

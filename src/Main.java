import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Baby baby1 = new Baby("Alex","M", "Che",2018);
        Baby baby2 = new Baby("Lucy", "F", "Che", 2016);
        Baby baby3 = new Baby("Michael", "M", "Che", 2020);
        Baby baby4 = new Baby("Ann", "F", "Smith", 2015);
        Baby baby5 = new Baby("Alex", "M", "Che", 2018);

        HashSet<Object> babies = new HashSet<>();
        babies.add(baby1);
        babies.add(baby2);
        babies.add(baby3);
        babies.add(baby4);
        babies.add(baby5);

        baby1.hashCode();

        System.out.println(babies);
        System.out.println(baby1.hashCode());
        System.out.println(baby2.hashCode());
        System.out.println(baby3.hashCode());
        System.out.println(baby4.hashCode());

        System.out.println(baby1.equals(baby2));
    }
}
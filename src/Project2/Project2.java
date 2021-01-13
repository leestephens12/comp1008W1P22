package Project2;

public class Project2 {
    public static void main(String[] args) {

        System.out.printf("timeToSki(30) should be false: %b%n", timeToSki(30));
        System.out.printf("timeToSki(30) should be true: %b%n", timeToSki(10));
    }

    public static boolean timeToSki(int depth) {
        return depth > 30;
    }
}

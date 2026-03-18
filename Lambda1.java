interface MaxFinder {
    int findMax(int a, int b);
}

public class Lambda1 {
    public static void main(String[] args) {
        MaxFinder max = (a, b) -> (a > b) ? a : b;

        System.out.println("Greater number: " + max.findMax(10, 20));
    }
}
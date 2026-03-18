interface CheckRange {
    boolean isBetween(int num, int low, int high);
}

public class Lambda3 {
    public static void main(String[] args) {
        CheckRange check = (num, low, high) -> (num >= low && num <= high);

        System.out.println(check.isBetween(15, 10, 20)); // true
    }
}
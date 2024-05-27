public class clearIthBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 3;

        System.out.println("Before clearing ith bit: " + n);
        
        // Clearing the ith bit by performing bitwise AND with the complement of 1 << (i - 1)
        n = n & ~(1 << (i - 1));

        System.out.println("After clearing ith bit: " + n);
    }
}

package leetCode;

public class BitTest {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a^a);
        System.out.println(a^1);
        System.out.println(Integer.toBinaryString(a^1));
        System.out.println(a^0);
    }
}

package operator;

public class Operator4{
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: or 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false|| false);

        System.out.println("!연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);

    }
}

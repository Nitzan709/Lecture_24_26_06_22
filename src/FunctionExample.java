import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        System.out.println(letsDoSomeStuffOnString("abcdefg", String::toUpperCase));
    }

    private static String letsDoSomeStuffOnString(String str, Function<String, String> stuff) {
        return stuff.apply(str);
    }
}

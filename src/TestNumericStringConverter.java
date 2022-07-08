public class TestNumericStringConverter {
    public static void main(String[] args) {
        Converter<String, Integer> converter =Integer::valueOf;

        /*unboxing from Integer*/
        int number = converter.convert("123");

        System.out.println(number + 1);
    }
}
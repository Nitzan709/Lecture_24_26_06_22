import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> anonPredicate = PredicateExample::isNotEmpty;

        System.out.printf("Is it full? Answer: %s\n", anonPredicate.test("123"));
        System.out.printf("Is it full? Answer: %s\n", anonPredicate.test(""));

        Predicate<String> nonNullPredicate = Objects::nonNull;

        System.out.println(nonNullPredicate.test("something"));

    }

    private static boolean isNotEmpty(String s) {
        return !s.isEmpty();
    }
}

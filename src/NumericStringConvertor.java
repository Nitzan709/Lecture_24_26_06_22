public class NumericStringConvertor<T, R> implements Converter<String, Integer> {
    @Override
    public Integer convert(String from) {
        return Integer.valueOf(from);
    }
}

package сonverter;

public interface Converter<S, T> {
    T convert(S s);
}

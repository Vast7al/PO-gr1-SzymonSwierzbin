package pl.szymon.swierzbin;

public class PairUtil<T> {
    public static <T> Pair<T> swap(Pair<T> para) {
        Pair<T> prev_pair = new Pair<>(para.getFirst(), para.getSecond());
        para.swap();
        return prev_pair;
    }
}
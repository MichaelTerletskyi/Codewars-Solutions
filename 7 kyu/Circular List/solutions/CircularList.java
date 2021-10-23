//My Solution
public class CircularList<T> {
    private T[] elements;
    private int pos;
    private Boolean flag;

    @SafeVarargs
    public CircularList(final T... elements) {
        if (java.util.Objects.isNull(elements) || elements.length == 0) throw new RuntimeException();
        this.elements = elements;
        pos = elements.length - 1;
        flag = true;
    }

    T next() {
        ++pos;
        pos = pos > elements.length - 1 ? 0 : pos;
        return elements[pos];
    }

    T prev() {
        pos = pos - 1 < 0 ? elements.length - 1 : flag ? pos : --pos;
        flag = false;
        return elements[pos];
    }
}


//Best Solution
//public class CircularList<T> {
//    private int index = -1;
//    private int length;
//    final private T[] elements;
//
//    public CircularList(final T... elements) {
//        if (elements.length == 0) throw new RuntimeException();
//        this.elements = elements;
//        this.length = elements.length;
//    }
//
//    T next() {
//        if (++index == length) index = 0;
//        return elements[index];
//    }
//
//    T prev() {
//        if (--index < 0) index = length - 1;
//        return elements[index];
//    }
//}
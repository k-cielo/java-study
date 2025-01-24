package generic.test.ex2;

public class Pair<T1, T2> {

    private T1 first;
    private T2 Second;

    public void setFirst(T1 first) {
        this.first = first;
    }


    public void setSecond(T2 second) {
        Second = second;
    }
    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return Second;


    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", Second=" + Second +
                '}';
    }
}
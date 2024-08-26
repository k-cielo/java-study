package generic.test.ex1;

public class Container<T> {

    private T item;


    public void setItem(T item) {
        this.item = item;

    }

    public T isEmpty() {
        return null;
    }
    public boolean getItem(){
        return item != null;
    }

}

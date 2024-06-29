package exception.basic.uncheked;

public class Client {
    public void call() throws MyUncheckedException{
        throw new MyUncheckedException("ex");
    }
}

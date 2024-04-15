package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {

        String str = "hello";
        str.concat("java");
        System.out.println("str = "+str);//문자 안합쳐짐
    }
}

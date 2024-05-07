package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = "+sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();//문자열 뒤집기
        System.out.println("reverse = "+sb);

        //StringBuilder ->String
        String string = sb.toString();
        System.out.println("string = "+string);//마지막에 불변으로 바꿈
    }
}

package lang.string.method;

public class StringSpiltJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orage";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }


        String joinStr = "";
        /*for (String string : splitStr) {
            joinStr += string + "-";
        }*/
        //마지막에 붙는 - 빼기
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if(i != splitStr.length-1) {
                joinStr += "-";
            }
        }
        //=>식이 복잡해짐
        System.out.println("joinStr = "+joinStr);


        //join()
        String joinedStr= String.join("-", "a", "b", "c");
        System.out.println("joinedStr = "+joinedStr);

        //문자열 배열연결
        String result = String.join("-", splitStr);
        System.out.println("result = "+result);
    }
}

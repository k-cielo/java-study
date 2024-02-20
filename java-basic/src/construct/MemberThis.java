package construct;

public class MemberThis {
    String nameField;


    void initMember(String nameParameter){
        nameField = nameParameter;

    //필드명과 파라미터 이름이 다름, =>이름이 같지않으면(멤버변수에 찾아서 없으면)지역변수에서 찾아서 넣으므로 this생략가능

    }
}

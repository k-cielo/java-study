package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    //UserV2는 id(고객번호)가 같으면 논리적으로 같은 객체로 정의하겠다.

    private String id;


    public UserV2(String id) {
        this.id = id;
    }
/*
    @Override
    public boolean equals(Object obj) {
        //현재 나의 (this.id)id와 user.id가 같은가
        UserV2 user= (UserV2) obj;
         return  id.equals(user.id);

    }
*/
    //정확한 equals구현

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }



}

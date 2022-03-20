import java.util.*;
/* String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수를 완성
    seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다. */
public class FindKimInSeoul {
    public String findKimInSeoul(String[] seoul) {
        String answer = "";
        int num = 0;
        for(int i = 0; i < seoul.length; i++ ){
            if(seoul[i].equals("Kim")){
                num = i;
            }
        }

        answer = "김서방은 " + num +"에 있다";
        return answer;
    }

}

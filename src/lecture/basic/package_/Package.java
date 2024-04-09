package lecture.basic.package_;

import lecture.basic.package_.a.User;

public class Package {
    public static void main(String[] args) {
        /*
        * 패키지 정리
        *   - 같은 개념끼리 디렉터리를 묶어서 관리
        *   - 같은 패키지의 class는 import가 없어도 가져올 수 있다.
        *   - 다른 패키지의 class는 import 해서 사용한다. packageName.className
        *   - 서로 다른 패키지의 같은 class 중 하나만 import 가능, 다른 것은 풀네임 작성
        *
        * 패키지 생성 규칙
        *   - 패키지의 이름과 위치는 폴더 위치와 같아야 한다.
        *   - 일반적으로 모두 소문자를 사용한다.
        *   - 패키지 이름의 앞 부분에는 일반적으로 회사 도메인 이름을 거꾸로 사용한다. ex com.company.myapp
        *       - 외부 라이브러리와 중복 클래스 구분
        *       - os 별로 대소문자 규정이 달라 에러 가능성 -> java에서 소문자로 통일
        * */
        User userA = new User();
        lecture.basic.package_.b.User userB = new lecture.basic.package_.b.User();
    }
}

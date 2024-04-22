package com.inflearn.lecture.c_intermediate.lang.object.equals;

public class equals {

    public static void main(String[] args) {
        /*
        * 동일성 (==): 메모리에 물리적으로 동일한 공간에 저장되어 있는지 확인
        * 동등성 (.equals): 논리적으로 같은지 확인
        *   - 기본적으로 java의 .equals 는 == 으로 비교
        *   - 각 객체에 맞는 동등성 확인은 개발자가 equals 메서드를 오버라이딩으로 정의
        *   - 실무 equals 오버라이딩 메서드는 제너레이터 생성해서 사용
        *
        * */

        /* 동일성 예시 */
        sameMemory();

        /* 동등성 예시 */
        equality();
    }

    public static void sameMemory() {
        TestUser user1 = new TestUser("Id: 1000", "1");
        TestUser user2 = new TestUser("Id: 1000", "1");

        System.out.println(user1 == user2); // 동일성 false: 동일한 메모리 공간에 있지 않음
    }

    public static void equality() {
        TestUser user1 = new TestUser("Id: 1000", "1");
        TestUser user2 = new TestUser("Id: 1000", "1");

        user1.equals(user2); // 동등성 true: equals 메서드 오버라이딩 재정의
    }
}

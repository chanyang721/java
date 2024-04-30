package com.inflearn.lecture.c_intermediate.lang.string;

public class StringBasic {
    public static void main(String[] args) {
        /*
        * String 클래스
        *   사용 이유
        *       - 문자열 사용 편의성 제공
        *   주요 필드
        *       - Java 8 까지 char[] 필드 사용: 데이터 크기 2byte 문자열 1개 저장
        *       - Java 9 부터 byte[] 필드 사용: 데이터 크기 1byte 문자, 숫자 저장
        *
        * 특징
        *   - String 타입은 참조형이기 때문에 동일성 비교(==)가 불가능
        *   - String 타입은 동등성 비교(.equals)로 같은지 확인함
        *
        * 문자열 Pool
        *   - pool 이란, 공용 자원을 모아두는 곳을 의미
        *   - Heap 영역 사용
        *   - String 리터럴 사용 시, java는 메모리 효율 및 성능 최적화를 위해 문자열 풀을 사용
        *   - 클래스 생성 시, String 리터럴이 있다면 문자열 풀에 생성
        *       - String으로 문자열 생성 시, 문자열 풀에 있는지 확인
        *           - 있다면 해당 문자열의 주소 리턴
        *           - 없다면 새 문자열 주소 생성 후 리턴
        *
        * 문자열 비교로 equals을 사용하는 이유
        *   - 문자열 pool을 사용하면 동일성 비교 (==)로도 판단이 가능하다.
        *   - 하지만, new String으로 생성된 문자열은 동일성 비교 (==)로는 판단일 불가능 하다.
        *   - 따라서, new String, 문자열 pool 두 방법 모두 equals는 동일하게 판단 가능하기 때문에 equals로 통일해서 사용해야 혼동이 없다.
        *
        * 문자열 클래스는 불변 클래스
        *   - 문자열 pool 사용으로 인해 같은 문자을은 여러 변수에서 같이 사용된다.
        *   - 따라서, 문자열 수정 시 새로운 문자열 객체를 리턴한다.
        *
        * */
        String str = new String("string"); // "string"로 줄여서 사용
        String str2 = "string"; // 자바에서 new String() 대신 해줌

        String a = "Hello Immutable Object:  ";
        String b = "String Class";

        /* 문자열 합치는 방법 */
        System.out.println(a.concat(b)); // Hello Immutable Object:  String Class
        System.out.println(a + b); // Hello Immutable Object:  String Class

        /* 동일성 & 동등성 테스트 */
        IdentifyAndEqualityTest();

        /* string immutable test */
        ImmutableStringObject();
    }

    public static void IdentifyAndEqualityTest() {
        /* 문자열 Pool 미사용 */
        // 주소가 서로 다른 String 객체 생성
        String a = new String("테스트1");
        String b = new String("테스트1");
        System.out.println("new String 동일성 비교: " + (a == b)); // false: 각자 다른 메모리 공간에 저장되기 때문
        System.out.println("new String 동등성 비교: " + a.equals(b)); // true: 내부 로직에서 value가 같은지 비교하여 리턴 => StringLatin1.equals(value, aString.value);

        /* 문자열 Pool 사용 */
        // 문자열이 같다면 문자열 풀에 같은 주소로 저장, 같은 주소 반환 자동 처리
        String c = "테스트1";
        String d = "테스트1";
        System.out.println("문자열 풀 동일성 테스트: " + (c == d)); // true
        System.out.println("문자열 풀 동등성 테스트: " + c.equals(d)); // true
    }

    public static void ImmutableStringObject() {
        String str = "new string";
        String str1 = str + "immutable test";

        System.out.println("str: " + str); // 기존 value 유지
        System.out.println("str1: " + str1); // 새로운 value 생성


    }
}

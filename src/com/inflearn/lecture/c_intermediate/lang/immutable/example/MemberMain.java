package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class MemberMain {

    public static void main(String[] args) {
        Address address = new Address("서울");

        /*
        * 테스트 객체 생성
        *   - 같은 Address 객체를 참조 시 문제점
        *       - B 맴버 수정 시 A 맴버의 주소가 변경됨
        * */
        Member memberA = new Member("맴버A", address);
        System.out.println("memberA = " + memberA);
        Member memberB = new Member("맴버B", address);
        System.out.println("memberB = " + memberB);

        /*
         * 테스트
         *  - B 주소 수정 시 A 주소 변경 (같은 address 객체 사용)
         * */
        memberB.getAddress().setAddress("부산");
        System.out.println("memberA.getAddress().getAddressName() = " + memberA.getAddress().getAddressName()); // 부산
        System.out.println("memberB.getAddress() = " + memberB.getAddress().getAddressName()); // 부산

        /*
        * 불변 객체 생성 테스트
        * */
        ImmutableAddress immutableAddress = new ImmutableAddress("변경 불가능 주소");
        ImmutableMember immutableMemberA = new ImmutableMember("맴버A", immutableAddress);
        ImmutableMember immutableMemberB = new ImmutableMember("맴버A", immutableAddress);
        
        /* 불변 주소로 새로 생성한 불변 객체 */
        System.out.println("immutableMemberB.getAddress() = " + immutableMemberB.getAddress().getName());

        immutableMemberB.setAddress(new ImmutableAddress("변경 주소"));
        System.out.println("immutableMemberB.getAddress() = " + immutableMemberB.getAddress().getName());
    }
}

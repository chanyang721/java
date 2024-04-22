package com.inflearn.lecture.c_intermediate.lang.object.equals;

import java.util.Objects;

public class TestUser {
    private final String name;
    private final String code;


    public TestUser(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        /*
//         * 메서드 재정의
//         * */
//        TestUser userObj = (TestUser) obj;
//        System.out.println(STR."equals 오버라이딩: \{this.code.equals(userObj.code)}");
//        return this.code.equals(userObj.code); // 문자열 비교는 .eqauls() 사용
//    }

    /* 제너레이터 생성 */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof TestUser testUser)) return false;
        return Objects.equals(name, testUser.name) && Objects.equals(code, testUser.code);
    }
}


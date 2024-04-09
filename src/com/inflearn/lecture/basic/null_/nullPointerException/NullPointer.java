package com.inflearn.lecture.basic.null_.nullPointerException;

public class NullPointer {

    public static void main(String[] args) {
        /*
        * Null Pointer Exception
        * - null에 객체 참조값을 . 으로 접근을 시도하는 경우 발생
        * */
        Data data = null;
//        data.value = 10; // Cannot assign field "value" because "data" is null -> Null Pointer Exception

        /*
        * - 인스턴스의 필드가 null 인 경우
        * */
        BigData bigData = new BigData();
        System.out.println("BigData.data = " + bigData.data); // null
        System.out.println("BigData.count = " + bigData.count); // 0
        System.out.println("BigData.bool = " + bigData.bool); // false

//        bigData.data.value = 10; // Cannot assign field "value" because "data" is null -> Null Pointer Exception
        bigData.data = new Data();
    }
}

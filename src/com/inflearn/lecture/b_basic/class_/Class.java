package com.inflearn.lecture.b_basic.class_;

public class Class {

    public static void main(String[] args) {
        /*
        * Class 필요성
        *   - 동일한 형태의 데이터 형식을 선언하여 재사용하여 빠르고 정확하게 생성한다.
        *   - 구성 요소: 필드(맴버 변수), 메서드
        *
        * 1. 배열로 같은 데이터끼리 순서에 맞게 생성
        *     - 단점: 데이터 추가 / 삭제 시 관리 힘듬.
        *            하나로 분류되는 객체 형식을 여러개의 변수에 나눠서 담아야 하기 떄문에 관리가 어렵다
        *            ... 등 하나의 공통된 데이터 포멧(사용자 정의 타입)을 설계하여 재사용하기 위해 Class를 사용한다.
        *
        * 2. 객체, 인스턴스 차이점
        * - 모든 인스턴스는 특정 클래스과 관계가 있는 객체이다.
        * - 인스턴스 용어는 특정 클래스에서 생성되었다는 것을 소통 간 명시적으로 전달하기 위해 사용된다.
        * */
        String[] names = {"name1", "name2", "name3"};
        int[] ages = {10, 15, 12};
        String[] grades = {"A", "B", "C"};

        // Class 설계도에서 new 키워드로 실제 메모리에 데이터를 생성한다. 해당 데이터를 인스턴스라고 한다.
        // 인스턴스 생성
        Student student; // Student 타입을 넣을 수 있는 메모리 공간 확보
        student = new Student(); // Student 인스턴스 생성 후 메모리 할당
        student.name = "이찬양"; // . 키워드로 인스턴스의 참조값에 접근 후 String 타입 데이터 할당
        student.age = 10;
        student.grade = "A";

        System.out.println("이름: " + student.name);
        Student[] students = new Student[2]; // 클래스이자 타입으로 생성 가능. ?
        Student[] studentsShort = {new Student(), new Student()};

        System.out.println(students); // [LBasic.Class.Student;@a09ee92
        for (Student s : students) {
            System.out.println("이름: " + s);
        }
        for (int i = 0; i < studentsShort.length; i++) { // itar
            Student student1 = studentsShort[i]; // souf
        };
     }
}
package com.inflearn.lecture.b_basic.abstract_.example;

public class DriverMain { // repository

    public static void main(String[] args) {
        /*
        * OCP 원칙
        *   - Driver 클래스는 확장에 열려 있다
        *       - Car 추상 클래스와 의존 관계를 통해 새로운 차를 추가 할 수 있다.
        *   - Driber 클래스는 변경에 닫혀 있다.
        *       - 새로운 차를 생성해도 Driver의 구현부는 변경되지 않는다.
        *
        * 실행부
        *   - main 과 같이 실행을 담당하는 코드는 OCP와 무관하게 변경해야한다.
        * */
        Driver driver = new Driver();
        K3 k3 = new K3();
        Bmw bmw = new Bmw();

        driver.setCar(k3);
        driver.drive();

        driver.setCar(bmw);
        driver.drive();
    }
}

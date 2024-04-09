package lecture.basic.null_;

public class Null {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);

        data = new Data(); // 데이터 주소값 x001 할당
        data.value = 1;
        System.out.println("data = " + data);

        data = null; // 데이터 주소값 x001 제거

        /*
        * 가비지 컬렉션(GC): 참조할 수 없는 데이터가 메모리 공간을 차지하고 있는 경우 삭제
        *                 위의 경우 x001 인스턴스는 메모리 상 존재하지만, 사용자가 접근 할 방법이 없다.
        *                 자바는 JVM의 GC가 자동으로 해당 인스턴스를 삭제하여 메모리 누수를 방지
        * */
        System.out.println("data = "  + data);
    }
}
package com.inflearn.lecture.c_intermediate.lang.wrapper.problem;

import java.util.Random;

public class LottoGenerator {
    /*
        **문제 설명**
        로또 번호를 자동으로 만들어주는 자동 생성기를 만들자 로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
        각 숫자는 중복되면 안된다.
        실행할 때 마다 결과가 달라야 한다.
    * */

    private final Random random = new Random();
    private int[] numbers;
    private int count;

    public int[] generate() {
        numbers = new int[6];
        count = 0;

        while(count < 6) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                numbers[count] = number;
                count++;
            }
        }

        return numbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == number) return false;
        }

        return true;
    }
}

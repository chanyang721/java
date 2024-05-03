package com.inflearn.lecture.c_intermediate.lang.wrapper.problem;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();
        for (int lottoNumber : lottoNumbers) {
            System.out.println("lottoNumber = " + lottoNumber);
        }
    }
}

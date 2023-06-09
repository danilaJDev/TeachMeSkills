package patterns.behavioral.state;

import patterns.behavioral.state.service.*;

public class Main {
    public static void main(String[] args) {

        MathService mathService = new SumMathServiceImpl();

        int v1 = 10;
        int v2 = 5;

        System.out.println(mathService.calc(v1, v2));

        mathService = new MulMathServiceImpl();
        System.out.println(mathService.calc(v1, v2));

        mathService = new DevMathServiceImpl();
        System.out.println(mathService.calc(v1, v2));

        mathService = new DifMathServiceImpl();
        System.out.println(mathService.calc(v1, v2));

    }
}

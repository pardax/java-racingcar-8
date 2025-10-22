package racingcar;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String str = scan.nextLine();
        String[] arrStr = str.split(",");

        ArrayList<RacingCar> vecCar = new ArrayList<>();
        for(String s : arrStr){
            RacingCar temp = new RacingCar(s);
            vecCar.add(temp);
        }

        for(RacingCar s : vecCar){System.out.println(s.GetName());}

    }
}


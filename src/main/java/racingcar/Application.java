package racingcar;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String str = scan.nextLine();
        str = str.replaceAll(" ", "");
        String[] arrStr = str.split(",");

        //레이싱카 초기화
        ArrayList<RacingCar> vecCar = new ArrayList<>();
        for(String s : arrStr){
            RacingCar temp = new RacingCar(s);
            vecCar.add(temp);
        }

        //반복횟수 입력
        System.out.println("시도할 횟수는 몇 회인가요?");
        int nCycle = scan.nextInt();

        //반복 사이클
        int nGoal = -1;
        while(nCycle > 0){
            //각 자동차에 대해 전진명령
            for(RacingCar a : vecCar){
                a.TryMove();
                a.PrintDistance();
                nGoal = Math.max(nGoal, a.GetDistance());
            }
            System.out.println();
            nCycle--;
        }

        //최종우승자 출력
        ArrayList<String> lstWin = new ArrayList<>();
        for(RacingCar a : vecCar)
            if(nGoal == a.GetDistance()) lstWin.add(a.GetName());
        String res = String.join(", ", lstWin);

        System.out.println("최종 우승자 : " + res);
    }

}


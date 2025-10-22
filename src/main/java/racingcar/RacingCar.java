package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {

    private String name;
    private int distance;
    //private

    public RacingCar(String name){
        if(name.length() > 5) throw new IllegalArgumentException("extra name length");

        this.name = name;
        this.distance = 4;
    }

    public String GetName(){
        return this.name;
    }

    public void PrintDistance(){
        String progress = "-".repeat(distance);
        System.out.printf("%s : %s\n", name, progress);
    }

    public boolean TryMove(){
        int num = Randoms.pickNumberInRange(0, 9);
        if(num >= 4){
            return true;
        }
        return false;
    }


}

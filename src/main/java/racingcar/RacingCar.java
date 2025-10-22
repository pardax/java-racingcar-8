package racingcar;

public class RacingCar {

    private String name;
    private int distance;
    //private

    public RacingCar(String name){
        this.name = name;
        this.distance = 0;
    }

    public String GetName(){
        return this.name;
    }

    public int GetDistance(){
        return this.distance;
    }

}

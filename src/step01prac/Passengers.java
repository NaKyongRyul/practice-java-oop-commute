package step01prac;

public class Passengers {
    String name;
    int money;
    Transportations t;

    Passengers(String name, int money) {
        this.name = name;
        this.money = money;
    }

    void takeTransportation(Transportations t) {
        if(this.t != null) {
            System.out.println(name + "님은 이미 대중교통을 이용중입니다.");
        } else if(money < t.transportationsPrice) {
            System.out.println(name + "닝믄 돈이 부족합니다.");
        } else if (money >= t.transportationsPrice && this.t == null) {
            money -= t.transportationsPrice;
            t.transportationSum += t.transportationsPrice;
            t.passengerCnt++;
            this.t = t;
            System.out.println(name+ "님은 탑승이 완료되었습니다.");
        }
    }

    void leave() {
        if(this.t != null) {
            t.passengerCnt--;
            this.t = null;
        } else {
            System.out.println(name + "님은 탑승중인 대중교통이 없습니다.");
        }
    }

    public String toString() {
        return name + "은/는 현재 " + money + "원을 가지고 있습니다.";
    }
}

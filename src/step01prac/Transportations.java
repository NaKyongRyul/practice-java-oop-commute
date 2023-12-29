package step01prac;

public class Transportations {
    String subwayLineName;
    int busNumber;
    int transportationsPrice;
    int transportationSum;
    int passengerCnt;
    Transportations(String subwayLineName, int transportationPrice) {
        this.subwayLineName = subwayLineName;
        this.transportationsPrice = transportationPrice;
    }

    Transportations(int busNumber, int transportationPrice) {
        this.busNumber = busNumber;
        this.transportationsPrice = transportationPrice;
    }

    public String toString() {
        if(busNumber != 0) {
            return busNumber + "번 버스는 " + transportationSum + "원이 모였고, 현재" + passengerCnt + " 명의 승객이 탑승중입니다.";
        } else {
            return subwayLineName + " 지하철은 " + transportationSum + "원이 모였고, 현재" + passengerCnt + "명의 승객이 탑승중입니다.";
        }
    }
}

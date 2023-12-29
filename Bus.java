package dev.syntax.oop.step03commuting;

public class Bus extends PublicTransportation {
	int busNumber;

	public Bus(int busNumber) {
		this.fare = 1000;
		this.busNumber = busNumber;
		this.type = "버스";
	}

	@Override
	public String toString() {
		return this.busNumber+"번 "+this.type + "의 현재 이용 대금은 "+this.totalMoney+"원, 현재 탑승 중인 승객 수는 "+this.passengerCount+"명 입니다.";
	}
	
	
}

package dev.syntax.oop.step03commuting;

public class Subway extends PublicTransportation {
	String lineName;
	
	// 일반 지하철
	public Subway(String lineName) {
		this.lineName = lineName;
		this.type = "지하철";
		this.fare = 1500;
	}
	
	// 신분당선, 공항철도 등
	public Subway(String lineName, int fare) {
		this(lineName);
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "지하철 " + lineName + "의 현재 이용 대금은 "+this.totalMoney+"원, 현재 탑승 중인 승객 수는 "+this.passengerCount+"명 입니다.";
	}	
}


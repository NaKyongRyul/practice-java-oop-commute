package dev.syntax.oop.step03commuting;

public class PublicTransportation {
	int totalMoney;
	int passengerCount;
	int fare;
	String type = ""; //Subway or Bus
	
	//승객에게 돈받기
	public void receiveMoney(Student s) {
		s.money -= this.fare;
		totalMoney += this.fare;
	}
	
	//승객 탑승
	public void enter(Student s) {
		this.receiveMoney(s);
		passengerCount++;
		
	}
	
	public void leave() {
		passengerCount--;
	}
		
	

	
}










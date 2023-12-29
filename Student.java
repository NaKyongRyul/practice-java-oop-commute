package dev.syntax.oop.step03commuting;

public class Student {

	String name = "";
	int money;
	PublicTransportation p;

	// 생성자
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int money) {
		this(name);
		this.money = money;
	}

	// 대중교통 타기
	public void enter(PublicTransportation p) {
		if (this.money >= p.fare) {
			p.enter(this);
			this.p = p;
			printPublicTransporationInfo(p);
			System.out.println("에 탑승했습니다.");

		} else {
			System.out.print("현재 잔액이 부족하여 ");
			printPublicTransporationInfo(p);
			System.out.println("에 탑승할 수 없습니다.");
		}
	}

	// 대중교통 내리기
	public void leave(PublicTransportation p) {
		if (this.p == p) {
			p.leave();
			this.p = null;
			printPublicTransporationInfo(p);
			System.out.println("에서 내렸습니다.");
		} else {
			printPublicTransporationInfo(p);
			System.out.println("에 탄 적이 없습니다.");
		}
	}

	@Override
	public String toString() {
		return name + "님의 현재 잔액은 " + money + "원 입니다.";
	}

	void printPublicTransporationInfo(PublicTransportation p) {
		if (p instanceof Bus) {
			Bus b = (Bus) p;
			System.out.print(this.name + "님이 " + b.busNumber + "번 " + p.type);
		} else {
			Subway s = (Subway) p;
			System.out.print(this.name + "님이 " + s.type + " " + s.lineName);
		}
	}
}

package dev.syntax.oop.step03commuting;

public class World {

	public static void main(String[] args) {
		Subway line1 = new Subway("1호선");
		Subway lineAirport = new Subway("공항철도", 1900);
		
		PublicTransportation bus1 = new Bus(7730);
		PublicTransportation bus2 = new Bus(6715);
		
		Student s1 = new Student("조명하", 10000);
		Student s2 = new Student("천지민");
		Student s3 = new Student("나경률");

		s1.enter(line1);
		System.out.println(s1);
		s1.leave(line1);
		System.out.println(line1);
	
		s2.enter(bus1);
		s2.leave(bus1);
		System.out.println(bus1);
	}

}

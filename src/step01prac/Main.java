package step01prac;

public class Main {
    public static void main(String[] args) {
        Transportations subway = new Transportations("2호선", 1500);
        Transportations bus = new Transportations(171, 1000);

        Passengers p1 = new Passengers("나경률", 1600);
        Passengers p2 = new Passengers("천지민", 3500);
        //Passengers p3 = new Passengers("조명하", 3000);

        //ad
        p1.takeTransportation(subway);
        p2.takeTransportation(subway);
        p2.takeTransportation(bus);
        p2.leave();
        p2.leave();
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(subway);
        System.out.println(bus);
    }
}
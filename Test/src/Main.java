public class Main {
    public static void main(String[] args){
        System.out.println("----Cerinta a.----");
        Structura struct = new Structura();
        Box b1 = new Box("Telefoane");
        struct.add(b1);
        Phone p1 = new Phone("Samsung Galaxy A50",1100);
        struct.add(p1);
        Phone p2 = new Phone("Iphone 8",1700);
        struct.add(p2);
        Phone p3 = new Phone("Microsoft Lumia 950",600);
        struct.add(p3);
        Box b2 = new Box("Accesorii pentru telefon");
        struct.add(b2);
        Charger c1 = new Charger("Tip B",40);
        struct.add(c1);
        Charger c2 = new Charger("Tip C",70);
        struct.add(c2);
        Headphones h = new Headphones("Airpods",700);
        struct.add(h);
        struct.print();

        System.out.println("\n----Cerinta b.----");
        p1.setSOStrategy(new SistOpAndroid());
        p2.setSOStrategy(new SistOpIOS());
        p3.setSOStrategy(new SistOpWP());
        struct.print();

        System.out.println("\n----Cerinta c.----");
        PretTotal pret = new PretTotal();
        struct.accept(pret);
        pret.afisare();

    }
}

public class Main{
    public static void main(String args[]){
        Son s = new Son();
        Daughter d = new Daughter();

        System.out.println(s.getFirstName() + " " + s.getSurname());
        System.out.println(d.getFirstName() + " " + d.getSurname());
        s.newCar();
        d.newCar(2);
        s.school();
        s.school("n");
        s.setFirstName("Pasan");
        System.out.println(s.getFirstName() + " " + s.getSurname());
    }
}
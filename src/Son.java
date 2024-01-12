public class Son extends Father{
    String firstName = "Pasindu";
    int age = 20;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void school(){
        System.out.println("primary school");
    }
    public void school(String newest){
        System.out.println("secondary school");
    }
}

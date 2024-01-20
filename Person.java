class Persona
{
    String Firstname;
    String Lastname;
    int age;
    Persona (String Fname, String Lname, int a)
    {
        Firstname = Fname;
        Lastname = Lname;
        age = a;
    }
    String getfullname(){
        return Firstname + "" + Lastname;
    }
}
class Person{
    public static void main(String arg[]){
        persona a1 = new persona("Jhon","Doe",30);
        persona a2 = new persona("Alice","Smith",25);
        String kj = a1.getfullname();
        String jk = a2.getfullname();
        System.out.println("Person1: "+kj);
        System.out.println("Person2: "+jk);
        double average = ((a1.age + a2.age)/2.0);
        System.out.println("Average: "+average);

    }
}
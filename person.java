class persona
{
    String Firstname;
    String Lastname;
    int age;
    persona (String Fname, String Lname, int a)
    {
        Firstname = Fname;
        Lastname = Lname;
        age = a;
    }
    String getfullname(){
        return Firstname + "" + Lastname;
    }
}
class person{
    public static void main(String arg[]){
        persona a1 = new persona("Jhon","Doe",30);
        persona a2 = new persona("Alice","Smith",25);
        String kj = a1.getfullname();
        String jk = a2.getfullname();
        System.out.println("person1: "+kj);
        System.out.println("person2: "+jk);
        double average = ((a1.age + a2.age)/2.0);
        System.out.println("Average: "+average);

    }
}
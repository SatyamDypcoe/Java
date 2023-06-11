public class access_modifiers {

    static String name="Atif";
    int age=23;

    public void printNameAge(){
        System.out.println("My name is "+ name);

    }

    public static void main(String[] args) {
        access_modifiers o1=new access_modifiers();
        o1.printNameAge();
        int myage=o1.age;
        System.out.println(myage);

//        access_modifiers.printNameAge();
    }
}


//jvm{
////    access_modifiers obj=new access_modifiers();
////    access_modifiers.main()
//}
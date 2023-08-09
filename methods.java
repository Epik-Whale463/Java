public class methods {
    public static void main(String[] args) {
       // int age = 19;
       //hello("Charan",age);


        int x =3;
        int y =4;

        int result = addition(x, y);

        System.out.println(result);
    }
    

    static void hello(String a,int age) {
        System.out.println("Hello there, " +a+" and you are "+ age+" years old");
    }

    static int addition(int a ,int b) {
        
        int sum = a + b;
        return sum;
    }

}

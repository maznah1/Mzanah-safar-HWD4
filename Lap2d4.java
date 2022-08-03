package packge;
//Create a method that get a number as variable and check if this number is divided by 5 or not
//
//        - Throw exceptions if the number is not divided by 5
//        - Handle exception in main
//        - Use throw and throws

public class Lap2d4 {
//
//
    public static void main(String[] args) {
    try {
    num(4);
    } catch (Exception e){
    System.out.println("wrong");
}

    }
    public static void num (int num) {

            if (num % 5 == 0) {
                System.out.println(num + "is Divided ");

            } else

            throw new ArithmeticException();
        }
    }



public class TestThrow1 {
//function to check if person is eligible to vote or not
public static void validata(int age) {
if(age<18) {
//throw Arithmetic exception if not eligible to vote
throw new ArithmeticException("person is not eligible to vote")
}
else{
System.out.println("Person is eligible to vote!!");
}
}
//main method
public static void main(String args[]){
//call the function
validata(13);
System.out.println("rest of the code...");
}
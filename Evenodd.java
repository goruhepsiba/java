import java.util.Scanner;
class Evenodd{
  public static void main(String[] arr){
   Scanner SC=new Scanner(System.in);
   System.out.println("Enter the number:  ");
     int num=SC.nextInt();
     if(num%2==0){
       System.out.println(num + "is Even");
} else{
   System.out.println(num +" is Odd ");
}
}
}
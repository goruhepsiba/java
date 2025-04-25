import java.util.Scanner;
class Stringcomp{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your name:");
   String nam=sc.nextLine();
   if(nam.equals("java")){
    System.out.println("Good choice");
}
else{
 System.out.println("you have entered"+nam);
}
}
}
import java .io.*;
class Lattend extends Exception{
 Lattend(String str){
  super(str);
}
public static void main(String[] atgs)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the record submission status as(true/false)");
String ans=br.readLine();
boolean recordSubmitted = ans.equalsIgnoreCase("false");
try{
System.out.println("Enter the held classes");
double h=Double.parseDouble(br.readLine());
System.out.println("Enter the attended classes");
double at=Double.parseDouble(br.readLine());
double p=(at/h)*100;
System.out.println("percentage is "+p);
if(p<75){
Lattend lat=new Lattend("you are not allowed for JAVA LAB exam");
throw lat;
}
}
catch(Lattend la){
System.out.println(la);
}finally{
if(recordSubmitted){
System.out.println("you are not allowed for lab exam without record");
}
else{
System.out.println("you are aloowed for lab exam only if u have the record and attendance");
}
}
}
}
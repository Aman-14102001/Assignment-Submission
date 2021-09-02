/*
define a class student with following members: int roll, string name, float marks. input() to take input of the details display() to all details of a student.
String name-	To store the name of the student
int roll- To store the roll no  of the student
float marks- TO show marks
*/

/*
input() to take input of the details

display() to all details of a student.

Write a program to which will store details of a student and print the details using the above
*/
import java.io.*;
 
class Student {
 
 String name;
 int roll_no;
 int sub1,sub2;
 
 void getdata() throws IOException {
  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println ("Enter Name of Student");
  name = br.readLine();
  
  System.out.println ("Enter Roll No. of Student");
  roll_no = Integer.parseInt(br.readLine());
  
  System.out.println ("Enter marks out of 100 of 1st subject");
  sub1 = Integer.parseInt(br.readLine());
  
  System.out.println ("Enter marks out of 100 of 2nd subject");
  sub2 = Integer.parseInt(br.readLine());
 }
 
 void show() {
  
  int total = sub1+sub2;
  float per = (total * 100) / 200;
  System.out.println ("Roll No. = "+roll_no);
  System.out.println ("Name = "+name);
  System.out.println ("Marks of 1st Subject = "+sub1);
  System.out.println ("Marks of 2nd Subject = "+sub2);
  System.out.println ("Total Marks = "+total);
  System.out.println ("Percentage = "+per+"%");
 }
}
 
public class StudentDemo {
 
 public static void main(String[] args) throws IOException {
  
  Student s=new Student();
  s.getdata();
  s.show();
 }
}

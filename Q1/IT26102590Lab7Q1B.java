import java.util.Scanner;

public class IT26102590Lab7Q1B{

 public static void main(String[]args){
 
  Scanner input=new Scanner(System.in);
  
  for (int studentNo=1; studentNo<=3; studentNo++)
  
  {
  System.out.println("Student "+studentNo);
  double average =0;
  System.out.println("Enter the Subject 1 Mark;");
  int mark1= input.nextInt();
  
  System.out.println("Enter the Subject 2 Mark;");
  int mark2= input.nextInt();
  
  System.out.println("Enter the Subject 3 Mark;");
  int mark3= input.nextInt();
  
  System.out.println("Enter the Subject 4 Mark;");
  int mark4= input.nextInt();
  
  
  
   average = (mark1 + mark2+ mark3+ mark4)/4;
  
  System.out.println ("Average is "+average);
  
  if (average>=75 || average<=100)
  {System.out.println("Overall Grade is Distinction");}
  else if (average>=50)
  {System.out.println("Overall Grade is Credit");}
  else if (average>=0)
  {System.out.println("Overall Grade is fail");}
  else
  {System.out.println("Invalid marks");} System.out.print("\n");
  } 
 }
}
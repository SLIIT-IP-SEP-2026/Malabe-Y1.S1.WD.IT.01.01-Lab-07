import java.util.Scanner;
	public class IT26102481Lab7Q1A{
		public static void main (String[] args){
			Scanner input=new Scanner(System.in);
			
			int subject,total=0;
			double average;
			
				for(int i=1;i<=4;i++){
					System.out.print("enter subject mark"+" "+i+":");
					subject=input.nextInt();
					total+=subject;
				}
		average=total/4;
		System.out.println("average is"+" :"+average);
			
				if(average>=75){
				System.out.print("overall grade is : distinction");
				}
				
				else if(average>=50){
					System.out.print("overall grade is : credit");
					
				}
				else{
					System.out.print("overall grade is : fail");
				}
		
		}
	}
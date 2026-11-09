import java.util.Scanner;
	public class IT26102481Lab7Q1B{
		public static void main (String[] args){
			Scanner input=new Scanner(System.in);
			
			int marks,total=0;
			double average;
			
				for(int i=1;i<=3;i++){
					total=0;
					System.out.println("student "+i);
					System.out.print("enter mark :");
					for(int j=1;j<=4;j++){
						marks=input.nextInt();
						total+=marks;	
					}
					average=total/4;
					System.out.println("average is :"+average);
				
				if(average>=75){
				System.out.println("overall grade is : distinction");
				}
				
				else if(average>=50){
					System.out.println("overall grade is : credit");
					
				}
				else{
					System.out.println("overall grade is : fail");
				}
				System.out.println();
				}
				
		
		}
	}
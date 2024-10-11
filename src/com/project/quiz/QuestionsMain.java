package com.project.quiz;

import java.util.Scanner;

public class QuestionsMain {

	public static void main(String[] args) {
		QuestionService service=new QuestionService();
		 System.out.println("Are you ready for Quiz ??? ");
		 Scanner sc=new Scanner(System.in);
		 String ans=sc.next();
		 int i=1;
		 do {
			 if(ans.equalsIgnoreCase("Yes")) {
				 System.out.println("\n Lets start the Quiz :\n ");
				 service.playQuiz();
				 System.out.println("\n Do you want to check score ??");
				 String ans1=sc.next();
				 if(ans1.equalsIgnoreCase("Yes")) {

					 service.printScore();
					 System.out.println("\n ....");
					 service.diplayCorrectAnswers();
					 break;
				 }else {
					 break;
				 }
				 
			 }else {
				 System.out.println(" Exiting ...");
				 break;
			 } 
		 }while(i!=0);
	
	   
	    
	    

	}

}

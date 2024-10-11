package com.project.quiz;

import java.util.Scanner;

public class QuestionService {

	Questions[] questions =new Questions[5];
	String[] selection=new String[5];
	 public QuestionService() {
		questions[0]=new Questions(1,"My Favorite color :","RosePink","Black","Blue","Turqoise","RosePink");
		questions[1]=new Questions(2,"My Favorite food :","PavBhaji","Burger","KurkureMomos","Puranpoli","Puranpoli");
		questions[2]=new Questions(3,"Color of Banana Leaves :","Blue","TurquoiseGreen","BrightGreen","LightBlue","BrightGreen");
		questions[3] = new Questions(4, "Capital of India:", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
		questions[4] = new Questions(5, "Largest Planet in Our Solar System:", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
	
	 
	 }

	public void  playQuiz(){
		int i=0;
	     for(Questions q :questions) {
	    	 System.out.println("Question no."+q.getId()+"]  "+q.getQuestion());
	    	 System.out.println("a) "+q.getOpt1()+"            b) "+q.getOpt2());
	    	 System.out.println("c) "+q.getOpt3()+"            d) "+q.getOpt4());
	    	 Scanner sc=new Scanner(System.in);
	    	 selection[i]= sc.next();
	    	 i++;
	    	System.out.println();
	     }
	     
	 }
	public void printScore() {
		int score=0;
		for(int i=0;i<questions.length;i++) {
			Questions que=questions[i];
			String originalAnswer=que.getAnswer();
			String userAnswer=selection[i];
			if(originalAnswer.equalsIgnoreCase(userAnswer)) {
				score++;
			}
		}
		System.out.println("Your Score is :"+score);
	}
	public void diplayCorrectAnswers() {
		System.out.println("\nDisplaying your Answers : ");
		int i=1,j=1;
		for(String s:selection) {
	    	 System.out.print(i+"] "+s+" ");
	    	 i++;
	     }
		
		System.out.println("\n\nCorrect Answers :");
		
		for(Questions q :questions) {
			System.out.print(j+"] "+q.getAnswer()+"  ");
			j++;
		}
	}
	
}

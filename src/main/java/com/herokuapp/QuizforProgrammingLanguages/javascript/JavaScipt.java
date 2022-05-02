package com.herokuapp.QuizforProgrammingLanguages.javascript;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JavaScipt {
	
	@Id
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	private int isdone;
	private String username;
	
	public JavaScipt() {
		
	}
	
	public JavaScipt(String question, String optionA, String optionB, String optionC, String optionD, String answer,
			int isdone, String username) {
		super();
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.isdone = isdone;
		this.username = username;
	}

	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getIsdone() {
		return isdone;
	}
	public void setIsdone(int isdone) {
		this.isdone = isdone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Java [question=" + question + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC
				+ ", optionD=" + optionD + ", answer=" + answer + ", isdone=" + isdone + ", username=" + username + "]";
	}
	
}

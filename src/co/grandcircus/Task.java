package co.grandcircus;

import java.util.ArrayList;
import java.util.List;

public class Task {

	private String memberName;
	private String taskDescription;
	private String dueDate;
	private boolean isItCompleted = false;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(String memberName, String taskDescription, String dueDate) {
		super();
		this.memberName = memberName;
		this.taskDescription = taskDescription;
		this.dueDate = dueDate;
		
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isItCompleted() {
		return isItCompleted;
	}

	public void setItCompleted(boolean isItCompleted) {
		this.isItCompleted = isItCompleted;
	}

	@Override
	public String toString() {
		return "Member Name: " + memberName + "   Task Description: " + taskDescription + "   Due Date: " + dueDate
				+ "   Completion: " + isItCompleted;
	}
	
	

}

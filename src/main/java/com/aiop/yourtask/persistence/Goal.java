package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="goal")
public class Goal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="goalId")
	private int goalId;

	@Column(name="goalName")
	private String goalName;
	
	@Column(name="goalDescription")
	private String goalDescription;
	
	@Column(name="idDiary")
	private int diaryId;
	
	
	public Goal() {}


	public Goal(int goalId, String goalName, String goalDescription, int diaryId) {
		this.goalId = goalId;
		this.goalName = goalName;
		this.goalDescription = goalDescription;
		this.diaryId = diaryId;
	}


	public Goal(String goalName, String goalDescription, int diaryId) {
		this.goalName = goalName;
		this.goalDescription = goalDescription;
		this.diaryId = diaryId;
	}


	public int getGoalId() {
		return goalId;
	}


	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}


	public String getGoalName() {
		return goalName;
	}


	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}


	public String getGoalDescription() {
		return goalDescription;
	}


	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}


	public int getDiaryId() {
		return diaryId;
	}


	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
	}


	@Override
	public String toString() {
		return "Goal [goalId=" + goalId + ", goalName=" + goalName + ", goalDescription=" + goalDescription
				+ ", diaryId=" + diaryId + "]";
	}



}
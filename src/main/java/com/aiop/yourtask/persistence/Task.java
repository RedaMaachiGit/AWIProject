package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="taskId")
	private int taskId;

	@Column(name="taskContent")
	private String taskContent;

	@Column(name="activityId")
	private int activityId;
	
		
	public Task() {}


	public Task(int taskId, String taskContent, int activityId) {
		this.taskId = taskId;
		this.taskContent = taskContent;
		this.activityId = activityId;
	}


	public Task(String taskContent, int activityId) {
		this.taskContent = taskContent;
		this.activityId = activityId;
	}


	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskContent() {
		return taskContent;
	}


	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}


	public int getActivityId() {
		return activityId;
	}


	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}


	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskContent=" + taskContent + ", activityId=" + activityId + "]";
	}
	
	
	
}
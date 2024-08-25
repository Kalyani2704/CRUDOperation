package com.application.dto;

public class TaskDTO {
	private String title;
	private String description;
	private String priority;
	private String status;
	private String due_date;
	private String created_at;
	private String updated_at;
	private long user_id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "TaskDTO [title=" + title + ", description=" + description + ", priority=" + priority + ", status="
				+ status + ", due_date=" + due_date + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", user_id=" + user_id + "]";
	}
}

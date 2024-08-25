package com.application.model;
import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String description;
	private String priority;
	@Column(nullable = false)
	private String status;
	@Column(nullable = false)
	private String due_date;
	@Column(nullable = false)
	private String created_at;
	@Column(nullable = false)
	private String updated_at;
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Users user;

	public Tasks() {

	}

	public Tasks(String title, String description, String priority, String status, String due_date,
			String created_at, String updated_at, Users user) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.due_date = due_date;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
	
	@Override
	public String toString() {
		return "Tasks [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", status=" + status + ", due_date=" + due_date + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", user=" + user + "]";
	}
}

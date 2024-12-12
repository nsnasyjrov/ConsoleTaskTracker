package Project.Task;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mytasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // описание каждой задачи
    @Column(name = "description", nullable = false, length = 250)
    private String description;
    // статус каждой задачи
    @Column(name = "status", nullable = false, length = 10)
    private String status;

    // дата добавления задачи
    @Column(name = "createdAt", nullable = false)
    @CreationTimestamp
    private Date createdAt;
    @Column(name = "updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt; // дата обновления задачи

    public Task() {
        this.status = "TODO";
        this.createdAt = new Date();
    }

    public Task(String description) {
        this.description = description;
        this.status = "TODO";
        this.createdAt = new Date();
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdAt;
    }

    public void setCreatedDate(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public void updateTask() {
        this.updatedAt = new Date();
    }
}


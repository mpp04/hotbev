package com.revature.Models;

import org.hibernate.annotations.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(appliesTo="task")
public class task {


@Id
@Column(name="id")
@GeneratedValue(strategy= GenerationType.AUTO)
private long id;



@Column(name="Description")
private String Description;

@Column(name="Priority")
private long priority;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }
}

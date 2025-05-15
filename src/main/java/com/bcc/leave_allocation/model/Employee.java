package com.bcc.leave_allocation.model;

import com.bcc.leave_allocation.enums.Position;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Position position;
    private int leaveCredits;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
        this.leaveCredits = position.getLeaveCredits();
    }
}

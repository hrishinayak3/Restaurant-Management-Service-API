package com.geekster.project.RestaurantManagementServiceAPI.Model;


import jakarta.validation.constraints.Pattern;
import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String adminName;

    @Pattern(regexp = "^.+@admin\\.com$")
    private String adminEmail;
    private LocalDateTime createdAt;

}
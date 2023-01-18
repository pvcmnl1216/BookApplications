/*
 * Author Name: Philip Meshach
 * Date: 16-01-2023
 * Praise The Lord
 */
package com.niit.BackendPractise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private int userId;
    @Id
    private String userName;
    private String email;
}

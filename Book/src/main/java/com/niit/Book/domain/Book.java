/*
 * Author Name: Philip Meshach
 * Date: 17-01-2023
 * Praise The Lord
 */
package com.niit.Book.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id
    private String bookName;
    private String authorName;
    private int price;

}

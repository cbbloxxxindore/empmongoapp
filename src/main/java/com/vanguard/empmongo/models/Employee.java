package com.vanguard.empmongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
@AllArgsConstructor
@NoArgsConstructor@Data
@Document(collection = "employee")
public class Employee {
   private int id;
   private double salary;

   private  String name;
}

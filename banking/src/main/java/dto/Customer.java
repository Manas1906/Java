package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@SequenceGenerator(initialValue =12110111, allocationSize =1, sequenceName ="cust_id", name ="cust_id")
	@GeneratedValue(generator="cust_id")
int cust_id;
String name;
String password;
String email;
String gender;
long mobile;
Date dob;


}

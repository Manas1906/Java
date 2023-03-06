package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class UserInfo {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
	String name;
	long mobile;
	String email;
	String password;
	Date dob;
	String gender;
	String adress;
	String country;
	String[] skills;
	int age;
	
	

}

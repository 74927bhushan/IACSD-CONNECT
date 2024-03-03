package com.studentManagement.modal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
 
 {
 "firstname";"Maximus",
 "lastname";" Wales",
 "phone";"9123456789",
 "gender";"MALE",
 "dob";"2000-01-01",
 "address";"Sparta"
 }
 
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String student_id;
    @NotBlank(message = "firstName can't be blank")
    private String firstname;
    @NotBlank(message = "lastname can't be blank")
    private String lastname;
    @NotBlank(message = "phone can't be blank ")
    private String phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Past(message = "date of birth should be in past format")
    @NotNull(message = "date of birth can't be blank")
    private LocalDate dob;

    @NotBlank
    private String address;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}

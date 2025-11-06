package com.tnsif.springAnnotations.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//making bean class
@Component
public class MusicTeacher {
	@Value("Gopal")
    private String name;

    @Value("23")
    private int yearsOfExperience;

    @Value("BTech")
    private String qualification;

    @Value("Anna University")
    private String university;
    
    public MusicTeacher() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "MusicTeacher [name=" + name + ", yearsOfExperience=" + yearsOfExperience + ", qualification="
				+ qualification + ", university=" + university + "]";
	}

	public String getTeacherInfo() {
		// TODO Auto-generated method stub
		return "Music Teacher (Name: " + name + ", Experience in years: " + yearsOfExperience + ", Qualification: " + qualification + ", University: " + university + ")";
	}
    
    
}
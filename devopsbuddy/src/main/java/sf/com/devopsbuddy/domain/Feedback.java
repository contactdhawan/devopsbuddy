package sf.com.devopsbuddy.domain;

import java.io.Serializable;

public class Feedback implements Serializable {

	public static final long serialVersionUID = 1L;

	String firstName;
	String lastName;
	String email;
	String feedback;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", feedback="
				+ feedback + "]";
	}

}

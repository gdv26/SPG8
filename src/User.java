
public class User {

	private String identityCardNumber;
	private String firstName;
	private String lastName;
	private String CNP;
	private String address;
	
	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

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

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String identityCardNumber, String firstName, String lastName, String cNP, String address) {
		this.identityCardNumber = identityCardNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		CNP = cNP;
		this.address = address;
	}
	
	
}

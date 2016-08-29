package seedu.addressbook.data.person;

/**
 * @author anton
 * Represents the PostalCode component for a person's address
 */

public class PostalCode {
	private String postalCode;
	
	public PostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}
}

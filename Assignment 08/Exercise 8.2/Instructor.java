/**
 * Instructor
 */
public class Instructor extends Person {

    private String contactDetails;

    public Instructor(String name, String id, String contactDetails) {
        super(name, id);
        this.contactDetails = contactDetails;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}

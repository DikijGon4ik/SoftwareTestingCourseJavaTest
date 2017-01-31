package sotfware.qajava.addressbook.model;

public class ContactInfo {
  private final String homePhone;
  private final String mobilePhone;
  private final String email;

  public ContactInfo(String homePhone, String mobilePhone, String email) {
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.email = email;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getEmail() {
    return email;
  }
}

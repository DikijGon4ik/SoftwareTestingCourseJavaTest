package sotfware.qajava.addressbook;

public class PersonalData {
  private final String firstName;
  private final String lastName;
  private final String nickname;

  public PersonalData(String firstName, String lastName, String nickname) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickname = nickname;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }
}

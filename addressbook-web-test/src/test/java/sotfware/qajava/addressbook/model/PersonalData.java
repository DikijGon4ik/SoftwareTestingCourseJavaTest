package sotfware.qajava.addressbook.model;

public class PersonalData {
  private final String firstName;
  private final String lastName;
  private final String nickname;
  private String group;

  public PersonalData(String firstName, String lastName, String nickname, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.group = group;
  }

  public String getFirstName() { return firstName; }
  public String getLastName()  { return lastName;  }
  public String getNickname()  { return nickname;  }
  public String getGroup()     { return group;     }
}

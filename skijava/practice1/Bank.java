import org.apache.commons.lang3.builder.*;

public class Bank {
  String name;
  String adress;

  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }
}

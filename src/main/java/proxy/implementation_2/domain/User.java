package proxy.implementation_2.domain;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private long id;
    private String name;
    private String password;

    public User(String name,
                String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
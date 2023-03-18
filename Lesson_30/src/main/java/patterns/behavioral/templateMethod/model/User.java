package patterns.behavioral.templateMethod.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private Date birthday;


}

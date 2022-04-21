package chain_of_responsibility.implementation_1.utils;

import chain_of_responsibility.implementation_1.domain.User;
import chain_of_responsibility.implementation_1.exceptions.JSONException;

public class JSONUtils {

    public String toJSON(User user) {
        return "{" + "\n" +
                "\"username\": " + user.getUsername() + "\"," + "\n" +
                "\"password\": " + user.getPassword() + "\"\n" +
                "}";
    }

    public User fromJSON(String stringAuthObject) {
        if(stringAuthObject.startsWith("{") && stringAuthObject.endsWith("}")) {
            if(stringAuthObject.contains("\"username\":") && stringAuthObject.contains("\"password\":")) {
                User user = new User();
                user.setUsername(stringAuthObject.substring(stringAuthObject.indexOf("\"username\": \""), stringAuthObject.indexOf("\",")));
                user.setPassword(stringAuthObject.substring(stringAuthObject.indexOf("\"password\": \""), stringAuthObject.indexOf("\"}")));
                return user;
            } else {
                throw new JSONException("Wrong JSON Object");
            }
        } else {
            throw new JSONException("Incorrect format");
        }
    }
}

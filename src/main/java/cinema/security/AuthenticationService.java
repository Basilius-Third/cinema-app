package cinema.security;

import cinema.exception.AuthenticationException;
import cinema.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String name, String email, String password);
}

package Finteche.Bank.BankService.security.jwt;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

public class JwtUser implements UserDetails {

    private final Long id;
    private final String username;
    private final String password;
    private final String email;
    private final String accountnumber;
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final boolean enable;
    private final Date lastpasswordResetDate;

    public JwtUser(Long id, String username, String password, String email, String accountnumber, String firstName, String lastName, String patronymic,
                   boolean enable, boolean equals, Date lastpasswordResetDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.accountnumber = accountnumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.enable = enable;
        this.lastpasswordResetDate = lastpasswordResetDate;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

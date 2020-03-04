package GAMS.Servicelayer;

import GAMS.Crudrepository.EndUserRepo;
import GAMS.entity.EndUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("userDetailsService")
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private EndUserRepo userRep;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        EndUser user = userRep.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(
                    "No user found with username: "+ username);
        }

        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        List<String> roles = new ArrayList<>();
        roles = Arrays.asList(user.getRoleValue());

        return  new org.springframework.security.core.userdetails.User
                (user.getUsername(),
                        user.getPassword(), enabled, accountNonExpired,
                        credentialsNonExpired, accountNonLocked,
                        getAuthorities(roles));
    }

    private static List<GrantedAuthority> getAuthorities (List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

}
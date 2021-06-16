package tr.com.tandempartner.tandem.entity.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor 
public class User implements UserDetails{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String surname;
	
	
	private String password;
	
	@OneToMany
	private List<User> friends;
	
	
	@Email
	@NotBlank 
	@NotNull
	private String email;

	@Enumerated(EnumType.STRING)
	private LanguageOption wantToLearnLanguage;
	
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Date created;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("Role_user");

	}
	
	

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public UserInfo getUserInfo(boolean getMoreInfo) {
		List<UserInfo> friendsInfo =  new ArrayList<UserInfo>();
		if(getMoreInfo && friends!=null && friends.size()>0) {
			friends.forEach(e -> {
				friendsInfo.add(e.getUserInfo(false));
			});
		}
		UserInfo info = new UserInfo(id, name, surname, friendsInfo, wantToLearnLanguage, email,created);
		return info;
		
	}
	
	public UserInfo getUserInfoWithoutFriends() {
	
		UserInfo info = new UserInfo(id, name, surname, null, wantToLearnLanguage, email,created);
		return info;
		
	}
	
	
}




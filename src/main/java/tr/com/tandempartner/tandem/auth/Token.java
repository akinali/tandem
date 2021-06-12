package tr.com.tandempartner.tandem.auth;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import tr.com.tandempartner.tandem.entity.user.User;

@Data
@Entity
public class Token {
	
	@Id
	private String token;

	@ManyToOne
	private User user;
	

	
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Date created;
	

}

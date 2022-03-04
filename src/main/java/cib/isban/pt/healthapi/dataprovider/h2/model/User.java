package cib.isban.pt.healthapi.dataprovider.h2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

@Entity
@Table(name="users")
@SequenceGenerator(sequenceName="seq_users", name = "seq_users")
public class User implements Serializable {
    
    @Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_users")
    private Integer id;
	
    @NotBlank
	@Size(max = 100)
    private String login;
	
    @NotBlank
	@Size(max = 100)
	private String password;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
    private Date creationAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

	@Type(type="true_false")
	@Column(columnDefinition = "char(1)")
    private Boolean active;

}

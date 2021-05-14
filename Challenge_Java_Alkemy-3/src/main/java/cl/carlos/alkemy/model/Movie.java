package cl.carlos.alkemy.model;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7388853142886790764L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native" )
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column
	private String imageUrl;	
	
	@Column
	private String title;	
	
	@Column
	private Date movieYear;	
	
	@Column
	private int qualification;	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "movie_person",
			joinColumns = @JoinColumn(name="movie_id"),
			inverseJoinColumns = @JoinColumn(name="person_id"))
	private Set<Person>persons;

	public Movie() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	

	public Date getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(Date movieYear) {
		this.movieYear = movieYear;
	}

	public int getQualification() {
		return qualification;
	}

	public void setQualification(int qualification) {
		this.qualification = qualification;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	
	

}
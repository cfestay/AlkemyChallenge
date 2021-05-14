package cl.carlos.alkemy.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1795787153479175286L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native" )
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@Column
	private String imageUrl;
	
	@Column
	private String name;
	
	@Column
	public int age;
	
	@Column
	public int weight;
	
	@Column
	public String history;
	
	@Column
	public String movies;
	

	public Person() {
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String getHistory() {
		return history;
	}


	public void setHistory(String history) {
		this.history = history;
	}


	public String getMovies() {
		return movies;
	}


	public void setMovies(String movies) {
		this.movies = movies;
	}
	
	
	
}

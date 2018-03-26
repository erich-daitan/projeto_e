package puc.projetoe.model;

import com.fasterxml.jackson.annotation.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "edition")
	private String edition;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "leased")
	private boolean leased; // locado (sim,nao)
	
	@Column(name = "library_sector")
	private String librarySector;
	
	@Column(name = "publish_year")
	private String publishYear;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "conver_picture") //TODO - Check how to work with images
	private byte[] coverPicture;

}

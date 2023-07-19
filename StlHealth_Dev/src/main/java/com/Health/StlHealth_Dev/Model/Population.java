package com.Health.StlHealth_Dev.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_population")
public class Population {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "townname")
    private String townname;

    @Column(name = "population")
    private Long population;

	public Population(int id, String townname, Long population) {
		super();
		this.id = id;
		this.townname = townname;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTownname() {
		return townname;
	}

	public void setTownname(String townname) {
		this.townname = townname;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Population [id=" + id + ", townname=" + townname + ", population=" + population + "]";
	}

    // Getters and Setters

    
}

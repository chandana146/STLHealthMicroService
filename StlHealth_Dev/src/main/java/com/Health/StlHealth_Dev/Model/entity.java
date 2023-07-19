package com.Health.StlHealth_Dev.Model;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tbl_entity")
public class entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entity_id")
    private Long entity_id;

    @Column(name = "entity_name")
    private String entity_name;

    @Column(name = "created_date",nullable =false)
    private Date created_date;

    @Column(name = "updated_date",nullable =false)
    private Date updated_date;

	public entity(Long entity_id, String entity_name, Date created_date, Date updated_date) {
		super();
		this.entity_id = entity_id;
		this.entity_name = entity_name;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
public entity() {
	
}
	public Long getEntity_id() {
		return entity_id;
	}

	public void setEntity_id(Long entity_id) {
		this.entity_id = entity_id;
	}

	public String getEntity_name() {
		return entity_name;
	}

	public void setEntity_name(String entity_name) {
		this.entity_name = entity_name;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "entity [entity_id=" + entity_id + ", entity_name=" + entity_name + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + "]";
	}

}
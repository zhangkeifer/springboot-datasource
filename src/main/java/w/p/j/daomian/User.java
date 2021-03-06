/*
 * Copyright (c) 2015 - 9 - 28  11 : 59 :$second.second
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j.daomian;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by woniper on 14. 10. 25..
 */
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "age", nullable = false)
	private Integer age;


	public Long getId() {
		return id;
	}


	public void setId( Long id ) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName( String name ) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge( Integer age ) {
		this.age = age;
	}
}

package org.whale.entity

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "ships")
class Ship {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ships_id")
	Integer id

	@NotNull
	@Column(nullable = false)
	String name
	
	@Column(nullable = false)
	String captain

	@Column(nullable = false)
	String country
	
}

package org.whale.entity

import javax.persistence.*
import javax.validation.constraints.NotNull


@Entity
@Table(name="observers")
class Observer{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "observers_id")
	Integer id

	@NotNull
	@Column(nullable = false)
	String name

	String phone

	String email
}

package org.whale.entity

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "observations")
class Observation{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "observations_id")
	Integer id

	@NotNull
	Double latitude

	@NotNull
	Double longitude

	@ManyToOne
	@JoinColumn(name = "ships_id", referencedColumnName = "ships_id", nullable = false)
	Ship ship

	@ManyToOne
	@JoinColumn(name = "observers_id", referencedColumnName = "observers_id", nullable = false)
	Observer observer 
}

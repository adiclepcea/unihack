package org.whale.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.spockframework.spring.SpringBean

import org.whale.service.*
import org.whale.entity.*
import java.util.*

import spock.lang.Specification
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest
class ShipControllerTest extends Specification {
	
	@Autowired
	private MockMvc mvc

	@SpringBean
	ObservationService observationService = Mocks.mockObservationService()
	@SpringBean
	ObserverService observerService = Mocks.mockObserverService()
	@SpringBean
	ShipService shipService = Mocks.mockShipService()

	def "when get is performed then response has status 200"(){
		expect : "Status is 200"
		mvc.perform(get("/ship"))
			.andExpect(status().isOk())
	}
}

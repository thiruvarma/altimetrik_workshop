package com.altimetrik.workshop.vehicleservice.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.altimetrik.workshop.vehicleservice.model.Vehicle;
import com.altimetrik.workshop.vehicleservice.model.VehicleDecodedVariable;

@RestController
@RequestMapping("/altimetrik/vehicle")
public class VehicleResource {

	// My Car url:
	// https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/2HKRM4H74FH695177

	@RequestMapping("/getVehicleInfo/{vin}")
	public List<HashMap> getVehicleDetails(@PathVariable("vin") String vehicleVin) throws Exception {
		RestTemplate template = new RestTemplate();
//
//		 ClientHttpRequestFactory requestFactory = new
//		 HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
//		 RestTemplate restTemplate = new RestTemplate(requestFactory);

		
//		RestTemplate restTemplate = new RestTemplate();
//		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
//		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
//		

		Vehicle vehicle = template
				.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/" + vehicleVin, Vehicle.class);
		System.out.println("Vehicle details   " + vehicle);
		List<HashMap> VaribleMap = filterDecodedVariables(vehicle);
		return VaribleMap;
	}

	public List<HashMap> filterDecodedVariables(Vehicle vehicle) throws Exception {

		List<HashMap> variableMap = new ArrayList<HashMap>();
		if (null == vehicle) {
			throw new Exception("no vehicle details passed.");
		} else {
			List<VehicleDecodedVariable> variableList = vehicle.getVehicleVariableList();
			for (VehicleDecodedVariable vehicleVariable : variableList) {
				String value = vehicleVariable.getValue();
				HashMap varMap;
				if (value != null && value.equalsIgnoreCase("")) {
					varMap = new HashMap();
					String variable = vehicleVariable.getVariable();
					varMap.put(value, variable);
					variableMap.add(varMap);
				}
			}

		}
		return variableMap;

	}

}

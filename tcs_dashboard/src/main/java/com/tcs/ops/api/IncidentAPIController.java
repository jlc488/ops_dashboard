package com.tcs.ops.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tcs.ops.model.incident.IncidentBean;


@Controller
@RequestMapping(value = "/api/incident")
public class IncidentAPIController {

	
	@RequestMapping(method = RequestMethod.GET, value="/list")
	public ResponseEntity<?> getIncidentsList(){
		
		List<IncidentBean> ret = new ArrayList<>();
		
		HttpStatus status = (ret != null )? HttpStatus.OK : HttpStatus.NO_CONTENT;
		
		return new ResponseEntity<List<IncidentBean>>(ret, status);
		
	}//getIncidentsList
	
	
	@RequestMapping(method = RequestMethod.POST, value="/save")
	public ResponseEntity<?> saveIncident(@ModelAttribute IncidentBean incBean){
		
		HttpStatus status = ( incBean != null )? HttpStatus.OK : HttpStatus.NO_CONTENT;
		
		return new ResponseEntity<IncidentBean>(incBean, status);
		
	}
}

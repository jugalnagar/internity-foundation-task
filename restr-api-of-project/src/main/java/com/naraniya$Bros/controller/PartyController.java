package com.naraniya$Bros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naraniya$Bros.model.Party;
import com.naraniya$Bros.service.PartyService;

@RestController
@RequestMapping("party")
public class PartyController {
	
	@Autowired
	private PartyService partyService;
	
	@PostMapping(produces="application/json",consumes="application/json")
	public Party addParty(@RequestBody Party party) {
		return partyService.saveParty(party);
	}
	
	@GetMapping(value="json",produces="application/json")
	public List<Party> showAllParty() {
		return partyService.showAllParty();
	}
}

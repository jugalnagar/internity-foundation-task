package com.naraniya$Bros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naraniya$Bros.dao.PartyDao;
import com.naraniya$Bros.model.Party;

@Service
public class PartyService {

	@Autowired
	private PartyDao partyDao;
	
	public Party saveParty(Party party) {
		return partyDao.saveOrUpdateParty(party);
	}
	
	public List<Party> showAllParty() {
		return partyDao.showAllParty();
	}
}

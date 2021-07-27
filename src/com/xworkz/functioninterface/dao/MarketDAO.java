package com.xworkz.functioninterface.dao;

import java.util.Collection;

import com.xworkz.functioninterface.dto.MarketDTO;
import com.xworkz.functioninterface.function.MarketSearch;

public interface MarketDAO {
	MarketDTO find(MarketSearch marketsearch);
	Collection<MarketDTO> findAll(MarketSearch marketsearch);
	

}

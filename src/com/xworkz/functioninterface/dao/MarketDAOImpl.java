package com.xworkz.functioninterface.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functioninterface.constant.*;
import com.xworkz.functioninterface.dto.*;

import com.xworkz.functioninterface.constant.MarketType;
import com.xworkz.functioninterface.dto.MarketDTO;
import com.xworkz.functioninterface.function.MarketSearch;

public class MarketDAOImpl implements MarketDAO {
	private Collection<MarketDTO> collection = new ArrayList<MarketDTO>();
	public MarketDAOImpl() {
		MarketDTO dto = new MarketDTO( "Crawford_Market" ,"Mumbai" ,250 , MarketType.WHOLESALE_MARKET);
		MarketDTO dto1 = new MarketDTO( "MurdeshwaraFish_Market" ,"Murdeshwara" ,50 , MarketType.FISH_MARKET);
		MarketDTO dto2 = new MarketDTO( "Crawford_Market" ,"Mumbai" ,280 , MarketType.WHOLESALE_MARKET);
		MarketDTO dto3 = new MarketDTO( "DadarFlower_Market" ,"Mumbai" ,180 , MarketType.FLOWER_MARKET);
		MarketDTO dto4 = new MarketDTO( "Commercial_street" ,"Banglore" ,250 , MarketType.APPAREL_ACCESSORIES);
		this.collection.add(dto4);
		this.collection.add(dto2);
		this.collection.add(dto);
		this.collection.add(dto3);
		this.collection.add(dto1);
		
	}
	

	@Override
	public MarketDTO find(MarketSearch marketsearch) {
		Iterator< MarketDTO> itr  = this.collection.iterator();
		MarketDTO temp = null;
		while(itr.hasNext()) {
		MarketDTO marketDTO = itr.next();	
		if(marketsearch.search(marketDTO)) {
			temp=marketDTO;
			break;
		}
		}
		return temp;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch marketsearch) {
		Iterator< MarketDTO> itr  = this.collection.iterator();
		Collection<MarketDTO> temp = new ArrayList<MarketDTO>();
		while(itr.hasNext()) {
			MarketDTO marketDTO	= itr.next();
			if(marketsearch.search(marketDTO)) {
				temp.add(marketDTO);
				
				
			}
			
			
		}
		return temp;
	}

}

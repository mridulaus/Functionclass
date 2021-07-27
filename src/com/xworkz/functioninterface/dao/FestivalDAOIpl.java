package com.xworkz.functioninterface.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functioninterface.constant.MarketType;
import com.xworkz.functioninterface.constant.Religion;
import com.xworkz.functioninterface.dto.FestivalDTO;
import com.xworkz.functioninterface.dto.MarketDTO;
import com.xworkz.functioninterface.function.FestivalSearch;

public class FestivalDAOIpl implements FestivalDAO {
	private Collection<FestivalDTO> collection = new ArrayList<FestivalDTO>();

	@Override
	public boolean save(FestivalDTO dto) {
		boolean added = collection.add(dto);
		System.out.println("dto added " + added);
		return added;

	}

	public FestivalDAOIpl() {
		FestivalDTO dto = new FestivalDTO("Nagarapanchami", "India", 1, Religion.HINDUISM, "Patholi");
		FestivalDTO dto1 = new FestivalDTO("Christmas ", "Allovertheworld ", 1, Religion.CHRISTIANITY, "Plumcake'");
		FestivalDTO dto2 = new FestivalDTO("Deepavali", "India ", 3, Religion.HINDUISM, "Savouries");
		FestivalDTO dto3 = new FestivalDTO("Ramzan ", "Dubai", 10, Religion.ISLAM, "Biryani");
		FestivalDTO dto4 = new FestivalDTO("Vesak", "Southeast Asia", 1, Religion.HINDUISM, " Miso Udon Soup'");

		this.collection.add(dto4);
		this.collection.add(dto2);
		this.collection.add(dto3);
		this.collection.add(dto1);
		this.collection.add(dto);

	}

	@Override
	public FestivalDTO find(FestivalSearch search) {

		Iterator<FestivalDTO> itr = this.collection.iterator();
		FestivalDTO temp = null; // Assign null
		while (itr.hasNext()) {
			FestivalDTO fest = itr.next();
			if (search.search(fest)) {
				temp = fest;
				break;
			}
		}
		return temp;
	}

	@Override
	public Collection<FestivalDTO> findAll(FestivalSearch search) {
		Iterator<FestivalDTO> itr  = this.collection.iterator(); // itr objct creation
		Collection<FestivalDTO> temp = new ArrayList<FestivalDTO>(); // coll obj creation
		while(itr.hasNext()) { // test hasnext 
			FestivalDTO fest	= itr.next();
			if(search.search(fest)) {
				temp.add(fest);
				
				
			}
			
			
		}
		
		return temp;
	}

}

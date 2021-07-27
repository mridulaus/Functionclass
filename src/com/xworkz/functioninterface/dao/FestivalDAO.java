package com.xworkz.functioninterface.dao;

import java.util.Collection;

import com.xworkz.functioninterface.dto.FestivalDTO;
import com.xworkz.functioninterface.function.FestivalSearch;

public interface FestivalDAO {
	
	boolean save (FestivalDTO dto);
	FestivalDTO find(FestivalSearch search);
	Collection<FestivalDTO> findAll( FestivalSearch search);

}

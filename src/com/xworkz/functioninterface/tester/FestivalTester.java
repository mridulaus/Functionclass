package com.xworkz.functioninterface.tester;

import java.util.Collection;

import com.xworkz.functioninterface.dao.FestivalDAO;
import com.xworkz.functioninterface.dao.FestivalDAOIpl;
import com.xworkz.functioninterface.dto.FestivalDTO;
import com.xworkz.functioninterface.dto.MarketDTO;

public class FestivalTester {

	public static void main(String[] args) {
		FestivalDAO dao = new FestivalDAOIpl();
		 

				FestivalDTO finding = dao.find((a) -> a.getName().equals("Nagarapanchami"));
				System.out.println( "found it ");
				System.out.println("********************************");
				
				
				finding = dao.find((b) -> b.getNoOfDays() > 2 ); // lambdaa exp
				System.out.println( "found it ");
				System.out.println("********************************");
				
			finding  = dao.find((c) -> c.getRegion() .equals("India"));
			System.out.println( "found it ");
			System.out.println("********************************");
			finding  = dao.find((c) -> c.getSpclFood().equals("Idli"));
			System.out.println( "found it ");
			System.out.println("********************************");
			
			finding  = dao.find((c) -> c.getReligion().equals("JAINISM"));
			System.out.println( "found it ");
			System.out.println("********************************");	
			
			Collection<FestivalDTO> all = dao.findAll((dto) -> dto.getName().equals("Mumbai"));
			for (FestivalDTO festName : all) {
				System.out.println(festName);
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
			
			all = dao.findAll((dto) -> dto.getNoOfDays() > 3);
			for(FestivalDTO fest: all) {
				System.out.println(fest);
			}
	}

}

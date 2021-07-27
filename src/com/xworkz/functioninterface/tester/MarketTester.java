package com.xworkz.functioninterface.tester;

import java.util.Collection;

import com.xworkz.functioninterface.dao.MarketDAO;
import com.xworkz.functioninterface.dao.MarketDAOImpl;
import com.xworkz.functioninterface.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {
		MarketDAO dao = new MarketDAOImpl();
		// MarketDTO dtoSearch = dao.find(a)-> a

				MarketDTO found = dao.find((a) -> a.getName().equals("Crawford_Market"));
				System.out.println( "found it ");
				System.out.println("********************************");
				
				found = dao.find((b) -> b.getLocation().equals("Mumbai"));
				System.out.println("found it ");
				System.out.println("********************************");
				
				found = dao.find((c) -> c.getType().equals("WHOLESALE_MARKET"));
				System.out.println("found it ");
				System.out.println("********************************");
				

				found = dao.find((d) -> d.getNoOfShops() > 250);
				System.out.println("found it ");
				System.out.println("********************************");
				
				Collection<MarketDTO> all = dao.findAll((dto) -> dto.getLocation().equals("Mumbai"));
				for (MarketDTO marketDTO : all) {
					System.out.println(marketDTO);
				}
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");

				all = dao.findAll((dto1) -> dto1.getName().equals("DadarFlower_Market"));
				for (MarketDTO marketDTO : all) {
					System.out.println(marketDTO);
				}
				System.out.println("###########################");
				
				all = dao.findAll((dto) -> dto.getNoOfShops() > 200);
				for (MarketDTO marketDTO : all) {
					System.out.println(marketDTO);
				}
				System.out.println("**************************");

			
	}

}

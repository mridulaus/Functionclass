package com.xworkz.mytask.tester;

import com.xworkz.mytask.dto.FishDTO;
import java.util.*;
public class FishTester {

	public static void main(String[] args) {
	FishDTO dto = new FishDTO( "Sardine" ,"silverGrayish" , "MarineFish", 2.5f, 100, "female");
	FishDTO dto1 = new FishDTO( "Mackerel" ,"silver" , "MarineFish", 20.00f, 200, "female");
	FishDTO dto2 = new FishDTO( "Tuna" ,"dark red" , "MarineFish", 40.00f, 150, "female");
	FishDTO dto3 = new FishDTO( "Shark" ,"gray" , "MarineFish", 30.00f, 1000, "male");
	
	List<FishDTO> collection = new ArrayList<FishDTO>();
	collection.add(dto3);
	collection.add(dto1);
	collection.add(dto);
	collection.add(dto2);
	
	Comparator<FishDTO> fishNameDesc = new Comparator<FishDTO>() {

		@Override
		public int compare(FishDTO o1, FishDTO o2) {
			System.out.println("invoked compare");
			return o2.getName().compareTo(o1.getName()); //sorted in desc
		}
		
	};
	Comparator<FishDTO> fishNameAsc = new Comparator<FishDTO>() {

		@Override
		public int compare(FishDTO o1, FishDTO o2) {
			System.out.println("invoked compare n sort in asc");
			return o1.getName().compareTo(o2.getName()); //sorted in asc
		}
		
	};
	
	Comparator<FishDTO> fishColorDesc = new Comparator<FishDTO>() {

		@Override
		public int compare(FishDTO o1, FishDTO o2) {
			System.out.println("invoked compare n sort color desc");
			return o2.getColor().compareTo(o1.getColor());
		}
		
	};
	Comparator<FishDTO> fishColorAsc = new Comparator<FishDTO>() {

		@Override
		public int compare(FishDTO o1, FishDTO o2) {
			System.out.println("invoked compare n sort color desc");
			return o1.getColor().compareTo(o2.getColor());
		}
		
	};

	Comparator<Float> fishLifeSpan = new Comparator<Float>() {

		@Override
		public int compare(Float o1, Float o2) {
		System.out.println("lifespan sorted in asc");
			return (Float.compare(o1, o2));
		}


		
		
	};
	
	Collections.sort(collection , fishNameDesc);
	   Iterator<FishDTO> itr = collection.iterator();
	   while(itr.hasNext()) {
		 FishDTO fishDetails = (FishDTO)  itr.next();
		 System.out.println("name in desc order " +fishDetails.getName() +" "+ " color  on desc  " +fishDetails.getColor()  );
		 
		   
	   }
	   Collections.sort(collection , fishNameAsc);
	   Iterator<FishDTO> itr1 = collection.iterator();
	   while(itr1.hasNext()) {
		 FishDTO fishDetails = (FishDTO)  itr1.next();
		 System.out.println("name in asc order " +fishDetails.getName() );
		 
		   
	   }
	   Collections.sort(collection , fishColorAsc);
	   Iterator<FishDTO> itr2 = collection.iterator();
	   while(itr2.hasNext()) {
		 FishDTO fishDetails = (FishDTO)  itr2.next();
		 System.out.println("color in asc order " +fishDetails.getColor() );
		 
		   
	   }
//	   Collections.sort(collection , fishLifeSpan);
//	   Iterator<FishDTO> itr3 = collection.iterator();
//	   while(itr3.hasNext()) {
//		 FishDTO fishDetails = (FishDTO)  itr3.next();
//		 System.out.println("color in asc order " +fishDetails.getLifeSpan());
//		 
//		   
//	   }
	
	

	}

}

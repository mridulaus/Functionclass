package com.xworkz.rogidetails.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.rogidetails.dao.RogiDAO;
import com.xworkz.rogidetails.dao.RogiDAOImpl;
import com.xworkz.rogidetails.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {
 RogiDTO dto = new RogiDTO(1 , "xyz" , 86 , "Malaria" , true);
 RogiDTO dto1 = new RogiDTO(2 , "abc" , 66 , "Covid" , true);
 RogiDTO dto2 = new RogiDTO(3 , "qwerty" , 93 , "Parkinson" , false);
 RogiDTO dto3 = new RogiDTO(4 , "zxcv" , 59 , "Alzheimer" , false);
 RogiDTO dto4 = new RogiDTO(5 , "aschi" , 76 , "Influenza" , true);
// Collection<RogiDTO>  collection = new ArrayList<>();
 
// collection.add(dto4);
// collection.add(dto);
// collection.add(dto2);
// collection.add(dto1);
// collection.add(dto3);
 
// RogiDAO dao = new RogiDAOImpl();
//  Optional<Integer> sizes = dao.totalSize();
// System.out.println(sizes);
// 
 

	
	Collection<RogiDTO> coll = Arrays.asList(dto,dto1,dto2,dto3,dto4);
	
	RogiDAO dao = new RogiDAOImpl();
	
   Optional<Integer> size = dao.totalSize();
   System.out.println(size);
	
	Optional<RogiDTO> box = dao.findone((a) -> a.getName().equals("zxcv"));
	if(box.isPresent()) { // checking wthr it is present or not
		RogiDTO get = box.get();
		System.out.println("get name of rogi    " + get.getName());
	}else {
		System.out.println("Rogi is not found ");
	}
	
	Collection<RogiDTO> collect = dao.findAll(); // findAll()
	for(RogiDTO temp :  collect) {
		System.out.println(temp);
		}
	
	

	
	
 

	}

}

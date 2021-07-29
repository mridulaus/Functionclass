package com.xworkz.rogidetails.dao;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.rogidetails.dto.*;
import com.xworkz.rogidetails.function.*;
public interface RogiDAO  {
Optional<RogiDTO> findone(RogiSearch search);
 default   Optional<Integer> totalSize() {
	return null;
}
 default Optional<RogiDTO> findByMaxAge(){
	return null;
	 
	 
 }
 default Optional<RogiDTO> findByMinAge(){
	return null;
	 
 }
default Collection<RogiDTO> findAll(){
	return null;
	
}
Collection<RogiDTO>findAll(RogiSearch Search);
}

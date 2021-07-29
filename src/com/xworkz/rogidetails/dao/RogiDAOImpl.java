package com.xworkz.rogidetails.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import com.xworkz.rogidetails.dto.RogiDTO;
import com.xworkz.rogidetails.function.RogiSearch;

public class RogiDAOImpl implements RogiDAO {
	private Collection<RogiDTO> collection = new ArrayList<RogiDTO>();

	@Override
	public Optional<RogiDTO> findone(RogiSearch search) {
		Iterator<RogiDTO> itr = this.collection.iterator();
		Optional<RogiDTO> optional = Optional.empty();
		while (itr.hasNext()) {

			RogiDTO rogiDto = itr.next();
			if (search.huduku(rogiDto)) {
				optional = Optional.of(rogiDto);
			}
		}
		return optional;
	}

	@Override
	public Optional<Integer> totalSize() {
//		Collection<RogiDTO> list = null;
//		//@SuppressWarnings("null")
		int total = collection.size();
		return Optional.of(total);
	}

//	@Override
//	public Optional<RogiDTO> findByMaxAge() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Optional<RogiDTO> findByMinAge() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Collection<RogiDTO> findAll() {
		return this.collection;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch Search) {

		Collection<RogiDTO> list = new ArrayList<RogiDTO>();
		this.collection.forEach(m -> {

			if (Search.huduku(m)) {
				list.add(m);

			}
		});
		return list;
	}

}

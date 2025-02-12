package com.tns.placementmanagement.placement.repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.placementmanagement.placement.entity.Placement;
	public interface PlacementRepository extends JpaRepository<Placement, Integer>{

	}

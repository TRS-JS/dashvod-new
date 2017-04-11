package com.lenovo.vod.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.lenovo.vod.entity.UVVVSTAT;

public interface UVVVSTATDAO extends PagingAndSortingRepository<UVVVSTAT, Long>,JpaSpecificationExecutor<UVVVSTAT>{
	

}


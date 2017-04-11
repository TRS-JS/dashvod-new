package com.lenovo.vod.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.lenovo.vod.entity.KeyOperationalData;

public interface KeyOperationalDataDAO extends PagingAndSortingRepository<KeyOperationalData, Long>,JpaSpecificationExecutor<KeyOperationalData>{

}

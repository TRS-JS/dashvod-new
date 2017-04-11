package com.lenovo.vod.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.lenovo.vod.entity.OverallDataTrends;

public interface OverallDataTrendsDAO extends PagingAndSortingRepository<OverallDataTrends, Long>,JpaSpecificationExecutor<OverallDataTrends>{

}

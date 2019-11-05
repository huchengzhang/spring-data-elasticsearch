package com.sishun.es.complex.repository;

import com.sishun.es.complex.domain.WarePO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WareRepository extends ElasticsearchRepository<WarePO, String> {

}

package com.sishun.es.complex.repository;

import com.sishun.es.complex.domain.EmployeePO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends ElasticsearchRepository<EmployeePO, String> {
}

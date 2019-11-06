package com.sishun.es.easy.repository;

import com.sishun.es.easy.domain.StudentPO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends ElasticsearchRepository<StudentPO, String> {
}

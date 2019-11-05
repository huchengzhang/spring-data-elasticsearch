package com.sishun.es.complex.service;

import com.sishun.es.complex.repository.WareRepository;
import com.sishun.es.complex.domain.WarePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WareServiceImpl implements WareService {

    @Autowired
    private WareRepository wareRepository;

    @Override
    public void batchInsertWare(List<WarePO> warePOList) {
        wareRepository.saveAll(warePOList);
    }

    @Override
    public List<WarePO> search(SearchQuery searchQuery) {
        return wareRepository.search(searchQuery).getContent();
    }
}

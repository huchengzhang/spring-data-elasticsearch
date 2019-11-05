package com.sishun.es.complex.service;

import com.sishun.es.complex.domain.WarePO;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import java.util.List;


public interface WareService {

    /**
     * 批量插入
     * @param warePOList WarePO List
     */
    void batchInsertWare(List<WarePO> warePOList);

    /**
     * 不分页搜索
     * @param searchQuery 查询条件
     * @return WarePO List
     */
    List<WarePO> search(SearchQuery searchQuery);
}

package com.sishun.es.easy.repository;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

import java.io.Serializable;


@Getter
@Setter
@ToString
@Document(indexName = "user", type = "student")
@Mapping(mappingPath = "student_mapping.json")
public class StudentPO implements Serializable {

    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}

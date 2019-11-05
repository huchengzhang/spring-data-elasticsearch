package com.sishun.es.easy.service;

import com.sishun.es.easy.dao.StudentRepository;
import com.sishun.es.easy.repository.StudentPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void batchInsertStudentPO(List<StudentPO> studentPOList) {
        studentRepository.saveAll(studentPOList);
    }

    @Override
    public void batchUpdateStudentPO(List<StudentPO> studentPOList) {
        for (StudentPO studentPO : studentPOList) {
            Optional<StudentPO> studentPOOpt = studentRepository.findById(studentPO.getId());
            if (studentPOOpt.isPresent()) {
                studentRepository.save(studentPO);
            }
        }
    }

    @Override
    public void batchDeleteStudentPO(List<StudentPO> studentPOList) {
        studentRepository.deleteAll(studentPOList);
    }

    @Override
    public List<StudentPO> search(SearchQuery searchQuery) {
        return studentRepository.search(searchQuery).getContent();
    }

    @Override
    public Page<StudentPO> searchWithPage(SearchQuery searchQuery) {
        return studentRepository.search(searchQuery);
    }
}

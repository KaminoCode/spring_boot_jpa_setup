package com.kaminocode.cruddemo.dao;

import com.kaminocode.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}

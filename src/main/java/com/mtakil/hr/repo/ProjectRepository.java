package com.mtakil.hr.repo;

import org.springframework.data.repository.CrudRepository;

import com.mtakil.hr.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
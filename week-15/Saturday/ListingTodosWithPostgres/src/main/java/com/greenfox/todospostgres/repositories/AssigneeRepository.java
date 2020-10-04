package com.greenfox.todospostgres.repositories;

import com.greenfox.todospostgres.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends JpaRepository <Assignee, Long> {

}

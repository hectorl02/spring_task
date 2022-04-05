package com.lopez.task.dao;

import com.lopez.task.model.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tarea, Integer> {


}

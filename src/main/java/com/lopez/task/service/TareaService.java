package com.lopez.task.service;

import com.lopez.task.model.Tarea;

import java.util.List;

public interface TareaService {

    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(Integer id);
    public void delete(Integer id);

}

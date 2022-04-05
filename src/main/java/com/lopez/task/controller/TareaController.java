package com.lopez.task.controller;

import com.lopez.task.model.Tarea;
import com.lopez.task.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping("/tareas")
    public List<Tarea> listar(){
        return  tareaService.findAll();
    }
    @PostMapping("/tareas")
    public  Tarea guardar(@RequestBody Tarea tarea){
        return tareaService.save(tarea);
    }

    @GetMapping("/tareas/{id}")
    public  Tarea unaTarea(@PathVariable Integer id) {
        return tareaService.findById(id);
    }

    @PutMapping("/tareas/{id}")
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id ){
        Tarea tareaActual = tareaService.findById(id);
        tareaActual.setTarea(tarea.getTarea());
        tareaActual.setFinalizado(tarea.getFinalizado());
        return tareaService.save(tareaActual);
    }

    @DeleteMapping("/tareas/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService.delete(id);
    }

}

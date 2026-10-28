package com.example.gustosValen;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class RController {

    final IGustosValenServicio iGustosValenServicio;


    RController(IGustosValenServicio iGustosValenServicio) {
        this.iGustosValenServicio = iGustosValenServicio;
    }

    @GetMapping("/showAll")
    public List<GustosValen> mostrarTODO(){
        return iGustosValenServicio.listaGustos();
    }

    @GetMapping("/sabor")
    public ResponseEntity<GustosValenDTO> buscarPorSabor(@RequestParam String sabor){

        GustosValen obj = iGustosValenServicio.findBySabor(sabor).orElseThrow(() -> new SaborNotFoundException("El sabor no existe"));
        
        GustosValenDTO dto = GustosValenMapper.toDTO(obj);

        return ResponseEntity.ok(dto);
    }

    @PostMapping("/aggSabor")
    public String agregarSabor(@Valid @RequestBody GustosValenDTO newSabor){

        GustosValen gustosValen = new GustosValen();

        gustosValen.setNombre(newSabor.getNombre());
        gustosValen.setSabor(newSabor.getSabor());
        gustosValen.setTamano(newSabor.getTamano());

        iGustosValenServicio.guardar(gustosValen);

        return "Se ha agregado correctamente";
    }

    @PutMapping("/modificarSabor/{id}")
    public String modificar(@PathVariable Long id, @RequestBody GustosValenDTO body){
        GustosValen gusto = iGustosValenServicio.findById(id).orElseThrow(()-> new SaborNotFoundException("No se encontró el id especificado"));
        
        gusto.setNombre(body.getNombre());
        gusto.setSabor(body.getSabor());
        gusto.setTamano(body.getTamano());
        iGustosValenServicio.guardar(gusto);

        return "modificacion hecha satisfactoriamente";
    }
    @DeleteMapping("/borrarSabor/{id}")
    public String borrarSabor(@PathVariable Long id){
        GustosValen obj = iGustosValenServicio.findById(id).orElseThrow(()-> new SaborNotFoundException("No se encontró el id especificado"));
        iGustosValenServicio.borrar(obj);
        return "El sabor ingresado, ha sido borrado";
    }




    
}
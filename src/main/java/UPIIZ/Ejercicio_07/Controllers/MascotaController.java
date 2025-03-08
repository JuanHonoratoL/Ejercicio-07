package UPIIZ.Ejercicio_07.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotaController {

    @GetMapping("/mascotas")
    public String ListadoMascota(){
        return"Mascotas/mascotas-listado";
    }

    @GetMapping("/mascotas/actualizar")
    public String actualizarMascota(){

        //Aquideberiamos actualiozar la mascota en la BD
        //Redireccionmos al listado de mascotas
        return "Mascotas/mascotas-actualizar";
    }

    @GetMapping("/mascotas/eliminar")
    public String formularioEliminar(){
        return "Mascotas/mascotas-eliminar";
    }

    @GetMapping("/mascotas/agregar")
    public String mostrarGuardar(){
        return "Mascotas/mascota-agregar";
    }

    @PostMapping("/mascotas/guardar")
    public String agregarMascota(){
        //Guardamnos la mascota y redireccionamos al listado
        return "redirect:/mascotas";
    }

    @PostMapping("/mascotas/eliminar")
    public String eliminarMascota(){
        //Aqui deberiamos eliminar de la BD la masota
        //Redirecccionamos la lista de mascotas
        return "redirect:/mascotas";}
}

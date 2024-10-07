package com.camiloduran.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas {
	private static String [] listaRecetas = {"Pizza", "Espagueti", "Lasagna"};
	private static HashMap<String, String []> recetasConIngredientes = new HashMap<String, String[]>();

	public ControladorRecetas() {
		String [] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
		recetasConIngredientes.put("Pizza", pizza);
		String [] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
		recetasConIngredientes.put("Espagueti", espagueti);
		String [] lasagna = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
		recetasConIngredientes.put("Lasagna", lasagna);
	}
	
	@GetMapping("/recetas")
	public String obtenerTodasLasRecetas(Model model) {
		model.addAttribute("listaRecetas", listaRecetas);
		
		return "recetas.jsp";
	}
	
	@GetMapping("/recetas/{nombre}")
	public String obtenerRecetaPorNombre(@PathVariable("nombre") String nombre, Model model) {
		String[] ingredientes = recetasConIngredientes.get(nombre);
		
        if (ingredientes != null) {
            model.addAttribute("nombreReceta", nombre);
            model.addAttribute("ingredientes", ingredientes);
        } else {
            model.addAttribute("mensaje", "La receta no se encuentra en nuestra lista.");
        }
		
		return "detalleReceta.jsp";
	}
	
	
}

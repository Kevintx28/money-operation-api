package com.kevintx28.moneyoperationapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PersonaController {

    @GetMapping("/hijos")
    public List<HashMap<String, String>> obtenerPersonas(@RequestParam(value = "myName", defaultValue = "World") String name) {
        List<HashMap<String, String>> listaHijos = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> hijo1 = new HashMap<String, String>(); // obj1
        HashMap<String, String> hijo2 = new HashMap<String, String>(); // obj2
/*
hijos = [] //lista de elementos
hermano_mayor = {


}


hermano_menor = {
nombre: "Kevin",
apellido: "Tola",
edad: 17,
}

hijos.push(hermano_mayor)
hijos.push(hermano_menor)

*/



        hijo2.put("nombre", "Kevin");
        hijo2.put("apellido", "Tola Choque");
        hijo2.put("edad", "17");


        listaHijos.add(hijo1);
        listaHijos.add(hijo2);

        return listaHijos;
    }
    @GetMapping("/movimientos")
    public List<HashMap<String, String>> obtenerMovimientos(@RequestParam(value = "myName", defaultValue = "World") String name) {
        List<HashMap<String, String>> listaHijos = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> movimiento1 = new HashMap<String, String>(); // obj1
        HashMap<String, String> movimiento2 = new HashMap<String, String>(); // obj1
        HashMap<String, String> movimiento3 = new HashMap<String, String>(); // obj1
        HashMap<String, String> movimiento4 = new HashMap<String, String>(); // obj1
        HashMap<String, String> movimiento5 = new HashMap<String, String>(); // obj1

        public void ListaHijosActionPerformed(java.awt.event.ActionEvent){

        }
        String mensaje = null ;

        mensaje = ListaHijos.getSelectedItem().toString();



            movimiento1.put("monto", "1600");
            movimiento1.put("concepto", "compra de tarjeta grafica RTX 2080");
            movimiento1.put("tipo", "salida");
            movimiento1.put("moneda", "soles");

            movimiento2.put("monto", "2000");
            movimiento2.put("concepto", "Pago mensual de salario");
            movimiento2.put("tipo", "ingreso");
            movimiento2.put("moneda", "soles");

            movimiento3.put("monto", "10");
            movimiento3.put("concepto", "Chaufa de pollo");
            movimiento3.put("tipo", "salida");
            movimiento3.put("moneda", "soles");

            movimiento4.put("monto", "200");
            movimiento4.put("concepto", "Auriculares razer bluchuu");
            movimiento4.put("tipo", "salida");
            movimiento4.put("moneda", "soles");

            movimiento5.put("monto", "500");
            movimiento5.put("concepto", "Elabore diseño para la empresa xyz");
            movimiento5.put("tipo", "ingreso");
            movimiento5.put("moneda", "soles");

        listaHijos.add(movimiento1);
        listaHijos.add(movimiento2);
        listaHijos.add(movimiento3);
        listaHijos.add(movimiento4);
        listaHijos.add(movimiento5);

        return listaHijos;

    }
}

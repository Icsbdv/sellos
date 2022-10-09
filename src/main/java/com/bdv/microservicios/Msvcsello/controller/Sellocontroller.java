package com.bdv.microservicios.Msvcsello.controller;



import com.bdv.microservicios.Msvcsello.model.entities.Sello;
import com.bdv.microservicios.Msvcsello.services.ISelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("app")
public class Sellocontroller {





    @Autowired
    ISelloService selloService;

   

    @PostMapping("/crearsello")
    public ResponseEntity<?> crearFirma(@RequestBody Sello sello) throws IOException {
        Sello selloguardado=selloService.guardarSello(sello);
        return ResponseEntity.status(HttpStatus.CREATED).body(selloguardado);
    }


    @DeleteMapping("/eliminarsello")
    public ResponseEntity<?> eliminarSello(@RequestParam(name="productoid") String productoid,
                                           @RequestParam(name="consecutivo") Integer consecutivo,
                                           @RequestParam(name="idimagen") Long idimagen) throws IOException {
        Sello sello=new Sello();

        sello.setIconsecutivo(consecutivo);
        sello.setIimagen(idimagen);
        sello.setSproductid(productoid);

        selloService.eliminarSello(sello);
        return ResponseEntity.noContent().build();
    }







}

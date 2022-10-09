package com.bdv.microservicios.Msvcsello.services;



import com.bdv.microservicios.Msvcsello.model.entities.Sello;

import java.io.IOException;

public interface ISelloService {
    Sello guardarSello(Sello sello) throws IOException;

    void eliminarSello(Sello sello);
}

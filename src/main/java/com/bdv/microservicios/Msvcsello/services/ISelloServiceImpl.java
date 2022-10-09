package com.bdv.microservicios.Msvcsello.services;


import com.bdv.microservicios.Msvcsello.model.entities.Sello;
import com.bdv.microservicios.Msvcsello.model.repo.IselloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ISelloServiceImpl implements ISelloService{

    @Autowired
    IselloRepo selloRepo;






    @Override
    public Sello guardarSello(Sello sello) throws IOException {

        Long iImagen=sello.getIimagen();
        Long iTipoImagen=sello.getIimagen();
        String im=(sello.getImagen()).substring(2);
        String productId=sello.getSproductid();
        Integer consecutivo=sello.getIconsecutivo();

        byte[] ans = new byte[im.length() / 2];
        for (int i = 0; i < ans.length; i++)
        {
            int index = i * 2;
            // Using parseInt() method of Integer class
            int val = Integer.parseInt(im.substring(index, index + 2), 16);
            ans[i] = (byte)val;
        }

        byte[] im2=ans;

        selloRepo.sp_ICS_Microservices_SELLO("INSERT",iImagen,productId,consecutivo,im2);

         return sello;
    }

    @Override
    public void eliminarSello(Sello sello) {

        String idProducto=sello.getSproductid();
        Integer consecutivo=sello.getIconsecutivo();
        Long idImagen=sello.getIimagen();
        String user="PLATAFORMA";
        selloRepo.sp_STAMP("DELETE",idProducto,consecutivo,idImagen,user);

    }
}

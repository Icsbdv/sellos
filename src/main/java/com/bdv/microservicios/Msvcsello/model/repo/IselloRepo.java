package com.bdv.microservicios.Msvcsello.model.repo;




import com.bdv.microservicios.Msvcsello.model.entities.Sello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IselloRepo extends JpaRepository<Sello,Long> {

    @Procedure
    void sp_ICS_Microservices_SELLO(@Param("Accion") String Accion,
                  @Param("iImagen") Long iImagen,
                  @Param("sProductoId") String sProductoId,
                  @Param("iConsecutivo") Integer iConsecutivo,
                  @Param("Imagen") byte[] Imagen

    );
    @Procedure
    void sp_STAMP(@Param("Accion") String Accion,
                  @Param("sProductoId") String sProductoId,
                  @Param("iConsecutivo") Integer iConsecutivo,
                  @Param("iImagen") Long iImagen,
                  @Param("sUser") String user
    )
            ;

}

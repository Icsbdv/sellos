package com.bdv.microservicios.Msvcsello.model.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "Sello",
                procedureName = "sp_ICS_Microservices_SELLO",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "Accion", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iImagen", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sProductoId", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iConsecutivo", type = Integer.class),
                       @StoredProcedureParameter(mode = ParameterMode.IN, name = "Imagen", type = String.class)


                }),
        @NamedStoredProcedureQuery(
                name = "Stamp",
                procedureName = "sp_STAMP",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "Accion", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sProductoId", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iConsecutivo", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iImagen", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sUser", type = String.class)
                })

})
public class Sello implements Serializable {

    @Id
    Long iimagen;

    String sproductid;

    Integer iconsecutivo;

    String imagen;


}

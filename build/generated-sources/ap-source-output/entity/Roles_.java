package entity;

import entity.Permisos;
import entity.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-17T14:09:08")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile ListAttribute<Roles, Usuarios> usuariosList;
    public static volatile SingularAttribute<Roles, Integer> idRol;
    public static volatile SingularAttribute<Roles, String> nombreRol;
    public static volatile SingularAttribute<Roles, String> detalleRol;
    public static volatile ListAttribute<Roles, Permisos> permisosList;

}
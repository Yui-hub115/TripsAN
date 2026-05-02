package com.trips.services;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.trips.models.Rol;

@Service
public class RolServiceImpl implements IRolService {

    private List<Rol> lista = null;

    public RolServiceImpl() {
        lista = new LinkedList<>();
        
        Rol r1 = new Rol();
        r1.setId(1);
        r1.setNomRol("UserAdmin");
        r1.setDescripcion("Administrador encargado con acceso a todo");
        r1.setActivo(true);
        r1.setFechaRegistro(new Date());

        Rol r2 = new Rol();
        r2.setId(2);
        r2.setNomRol("Vendedor");
        r2.setDescripcion("Persona encargada de la venta del servicio");
        r2.setActivo(true);
        r2.setFechaRegistro(new Date());
        
        Rol r3 = new Rol();
        r3.setId(2);
        r3.setNomRol("Visitante");
        r3.setDescripcion("Persona que adquiere el boleto para viaje al trip");
        r3.setActivo(true);
        r3.setFechaRegistro(new Date());

        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
    }

    @Override
    public List<Rol> buscarTodos() {
        return lista;
    }

    @Override
    public Rol buscarPorId(Integer idRol) {
        for (Rol r : lista) {
            if (r.getId().equals(idRol)) return r;
        }
        return null;
    }
}
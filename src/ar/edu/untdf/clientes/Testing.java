package ar.edu.untdf.clientes;

import ar.edu.untdf.clientes.modelo.Direccion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public List<Direccion> buscarDireccionesDelCliente(Long idCliente) {
        EntityManager em = (EntityManager) ClientesApp.getEmf();
        try {
            Query q = em.createQuery("select d from Direccion d where d.cliente.id = :id");
            q.setParameter("id", idCliente);
            List<Direccion> lista = (List<Direccion>) q.getResultList();
            return lista;
        } finally {
            em.close();
        }
    }
}

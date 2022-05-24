package co.edu.udea.udea_ruta2_ciclo2.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class EjemploConcesionario {

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        
        crearRegistros(factory);
        listarRegistros(factory);
        editarRegistros(factory);
        listarRegistros(factory);
        borrarRegistros(factory);
        listarRegistros(factory);
    }

    public static void crearRegistros(SessionFactory factory) {
        try (Session sesion = factory.openSession()) {
            Transaction transaccion = sesion.beginTransaction();
            Vendedor v1 = new Vendedor(100, "Juan", "Gómez", "Medellín");
            Vendedor v2 = new Vendedor(200, "José", "Rodríguez", "Bogotá");
            Vendedor v3 = new Vendedor(300, "Luis", "Giraldo", "Cartagena");
            sesion.save(v1);
            sesion.save(v2);
            sesion.save(v3);
            transaccion.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarRegistros(SessionFactory factory) {
        try (Session sesion = factory.openSession()) {
            Transaction transaccion = sesion.beginTransaction();
            Query consulta = sesion.createQuery("from Vendedor");
            List<Vendedor> vendedores = consulta.list();
            for (Vendedor v : vendedores) {
                System.out.println(v);
            }
            transaccion.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void editarRegistros(SessionFactory factory) {
        try (Session sesion = factory.openSession()) {
            Transaction transaccion = sesion.beginTransaction();
            Vendedor v = sesion.get(Vendedor.class, 100);
            v.setApellidos("Gómez Ramírez");
            v.setCiudad("Medellín, Antioquia");
            sesion.update(v);
            transaccion.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void borrarRegistros(SessionFactory factory) {
        try (Session sesion = factory.openSession()) {
            Transaction transaccion = sesion.beginTransaction();
            Vendedor v = sesion.get(Vendedor.class, 300);
            sesion.delete(v);
            transaccion.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

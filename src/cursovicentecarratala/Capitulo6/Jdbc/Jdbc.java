package cursovicentecarratala.Capitulo6.Jdbc;

import java.sql.*;

public class Jdbc {

    public static void main(String[] args) {
        //ASeguramos correcta conexion

        try {
            System.out.println("Intento conectarme a la base de datos");
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica", "root", "");
            System.out.println("La conexion se ha realizado con exito");

            //Empezamos a hacer peticiones al servidor
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("SELECT * FROM agenda ORDER BY id");

            //Para dar formato a mi tabla sin datos aun
            System.out.println("id\t Nombre \t Telefono");

            //Para recorrer uno a uno los elementos de la tabla
            while (resultado.next()) {
                System.out.println(resultado.getString("id") + "\t" + resultado.getString("nombre") + "\t" + resultado.getString("telefono"));
            }

        } catch (SQLException ex) {
            System.out.println("Error de mysql");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Se ha encontrado un error que es: " + e.getMessage());
        }
    }

}

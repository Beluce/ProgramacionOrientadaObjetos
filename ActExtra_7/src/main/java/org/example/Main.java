package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        LibroDAO ldao = new LibroDAO();

        try{

            Libro res = (Libro)ldao.buscarPorId("1");
            System.out.println(res);

            System.out.println("------------------------------------");

            for (Object lib: ldao.obtenerTodo()){
                System.out.println((Libro)lib);
            }

        }catch(SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }


        // -------------------------------------------------------

//        LibroDAO ldao = new LibroDAO();
//
//        Libro libro = new Libro(1, "El Perfume", "Patrick Suskind");
//
//        try{
//            if(ldao.update(libro)){
//                System.out.println("Se modifico correctamente");
//            }else{
//                System.out.println("No se pudo modificar");
//            }
//
//        }catch(SQLException sqle){
//
//            System.out.println("Error al insertar");
//
//        }

        //-------------------------------------------------------------



        //DemoLibroDB demo = new DemoLibroDB();
        //demo.insertarStatement();

        //Libro libro = new Libro(0, "El Juego", "Desconocido");

//        if (demo.insertarLibro(libro)){
//            System.out.println("Se inserto correctamente");
//        }else {
//            System.out.println("No se inserto");
//        }

       // System.out.println(demo.buscarLibro(100));

      //  System.out.println("-----------------------------------------------");

     //   for (Libro tmp: demo.obtenerTodos()) {
      //      System.out.println("Libro: " + tmp);
            
    //    }
    }
}
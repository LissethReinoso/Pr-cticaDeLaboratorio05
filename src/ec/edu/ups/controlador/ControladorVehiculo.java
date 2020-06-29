/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.*;
import java.util.List;
;

/**
 *
 * @author Usuario
 */
public class ControladorVehiculo {
    
    
    //DAO
    private IVehiculoDAO vehiculoDAO;
    private ITicketDAO ticketDAO;

    //Modelo
    private Vehiculo vehiculo;
    private Ticket ticket;
    
    //vista
     private VentanaVehiculo ingresov;

    public ControladorVehiculo(VentanaVehiculo ingresov,IVehiculoDAO vehiculoDAO) {
        this.ingresov = ingresov;
        this.vehiculoDAO = vehiculoDAO;
       
    }
     

    public ControladorVehiculo(VehiculoDAO vehiculoDAO, TicketDAO ticketDAO) {
        this.vehiculoDAO = vehiculoDAO;
        this.ticketDAO = ticketDAO;
    }

    public void registrar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        vehiculoDAO.create(vehiculo);
    }

    public void verVehiculo(String placa){
            vehiculo =vehiculoDAO.read(placa);
    }


    public void eliminar(){
            
    }

    public void verClientes(){
        List<Vehiculo> vehiculos;
        vehiculos = vehiculoDAO.findAll();
    }

    public void agregarTicket(int numero){
        ticket = ticketDAO.read(numero);
        vehiculo.setTicket(ticket);
        vehiculoDAO.update(vehiculo);
    }
    
    
    
}

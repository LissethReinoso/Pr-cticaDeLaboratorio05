/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.*;

import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.VentanaTicket;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorTicket {
    //DAO
    private ITicketDAO ticketDAO;
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;

    //Modelo
    private Ticket ticket;
    private Cliente cliente;
    private Vehiculo vehiculo;
   
    //ventana
    private VentanaTicket vTicket;
    
    
    public ControladorTicket(VentanaTicket vTicket, VehiculoDAO vehiculoDAO) {
        this.vTicket = vTicket;
        this.vehiculoDAO = vehiculoDAO;
    }

    public void registrar(Ticket ticket){
        this.ticket = ticket;
        ticketDAO.create(ticket);
    }
    
    public void verTicket(int numero){
            ticket =ticketDAO.read(numero);
    }

    public void verTickets(){
        List<Ticket> tickets;
        tickets = ticketDAO.findAll();

    }
    
     public void obtenerPago(){
     
         ticket.obtenerTotal();
         
         
     }
    
    
    
    
    
}

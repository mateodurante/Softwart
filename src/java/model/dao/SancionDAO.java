/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.util.ArrayList;
import model.entities.Publicacion;
import model.entities.Sancion;
import model.entities.Usuario;

/**
 *
 * @author agustin
 */
public interface SancionDAO {
    public boolean agregar(Sancion sancion);
    public ArrayList<Sancion> listar();

    public ArrayList<Publicacion> publicacionesSancionablesPara(Usuario u);
}
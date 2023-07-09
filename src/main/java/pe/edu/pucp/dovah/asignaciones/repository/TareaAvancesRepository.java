/*
 * Nombre del archivo: TareaAvancesRepository
 * Fecha de creación: 16/11/2022 , 12:31
 * Autor: Lloyd Erwin Castillo Ramos
 * Descripción:
 */
package pe.edu.pucp.dovah.asignaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pucp.dovah.asignaciones.model.TareaAvances;

public interface TareaAvancesRepository extends JpaRepository <TareaAvances,Long> {
}

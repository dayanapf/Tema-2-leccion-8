/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatica.f4.repositorio;

import informatica.f4.modelo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maira
 */
@Repository
public interface IButacaRepo extends JpaRepository<Butaca, Long>{

    
}

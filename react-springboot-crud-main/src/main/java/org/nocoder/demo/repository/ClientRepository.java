package org.nocoder.demo.repository;

import org.nocoder.demo.modal.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangjl
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
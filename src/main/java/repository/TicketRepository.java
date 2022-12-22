package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Atendente;
import domain.Ticket;

public interface TicketRepository extends JpaRepository <Ticket, Integer>{

  void update(Ticket ticket);
  
}

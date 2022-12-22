package service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import domain.Atendente;
import domain.Ticket;
import domain.UserID;
import repository.TicketRepository;
import vo.Mensagem;


public class TicketService {


  @Autowired
  private TicketRepository ticketRepository;
 

  public Optional<Ticket> findTicket (Integer id){
    return ticketRepository.findById(id);
  }

  public void verificaPermissaoMensagemTicket(Mensagem mensagem, UserID atendenteId, UserID clienteId){
    
    try {
      if ((mensagem.getAutor() == atendenteId ) || (mensagem.getAutor() == clienteId ))  {
        System.out.println("Liberado para inserir mensagem!");
      }
      
    } catch (Exception e) {
      System.out.println("Somente clientes e atendentes podem inserir mensagens no ticket....");
    }

  }

  public void update (Ticket ticket){
    ticketRepository.update(ticket);

}

}

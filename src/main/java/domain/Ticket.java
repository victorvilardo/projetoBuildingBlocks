package domain;

import java.util.Calendar;
import java.util.List;

import util.EscalarTicketException;
import util.TicketPrioridadeEnum;
import vo.Mensagem;

public class Ticket {
  
  private Integer id;
  private List<Produto> produtos;
  private UserID cliente;
  private List<Mensagem> mensagem;
  private UserID atendente;
  private TicketPrioridadeEnum ticketPrioridade;

  public Ticket(Integer id, List<Produto> produtos, UserID cliente, List<Mensagem> mensagem, UserID atendente, TicketPrioridadeEnum ticketPrioridade) {
    this.id = id;
    this.produtos = produtos;
    this.cliente = cliente;
    this.mensagem = mensagem;
    this.atendente = atendente;
    this.ticketPrioridade = ticketPrioridade;
  }


  public void definePrioridade (TicketPrioridadeEnum prioridade) throws EscalarTicketException{

    if (TicketPrioridadeEnum.ALTA.getRetornoValorString().equals("3")){
      System.out.println("PRIORIDADE ALTA............ ");
      escalaTicket(3);
    }
    if (TicketPrioridadeEnum.MEDIA.getRetornoValorString().equals("2")){
      System.out.println("PRIORIDADE MEDIA............ ESCALAR TCIKET");
      escalaTicket(2);
    }
    if (TicketPrioridadeEnum.BAIXA.getRetornoValorString().equals("1")){
      System.out.println("PRIORIDADE BAIXA............ ESCALAR TCIKET");
      escalaTicket(1);
    }
  }

  public void escalaTicket (int prioridade) throws  EscalarTicketException  {
    if (prioridade >= 3){
        throw new EscalarTicketException();
    }else{
        prioridade++;
    }

  }

  public void fechaTicketAtendimento(Calendar tempoLimite){
    if (Calendar.DAY_OF_MONTH > 4){
      System.out.println("Tempo limite de atendimento............ fechando ticket");
    }
  }

  public void adicionaMensagem(String corpoMensagem, UserID autor){
    this.mensagem.add (new Mensagem(corpoMensagem, autor)); 
  }

  public Integer getId() {
    return id;
  }


  public List<Produto> getProdutos() {
    return produtos;
  }


  public UserID getCliente() {
    return cliente;
  }

  public UserID getAtendente() {
    return atendente;
  }


  public TicketPrioridadeEnum getTicketPrioridade() {
    return ticketPrioridade;
  }
}

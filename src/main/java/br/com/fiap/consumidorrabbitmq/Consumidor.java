package br.com.fiap.consumidorrabbitmq;

import br.com.fiap.consumidorrabbitmq.model.InfoMensagem;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Consumidor {

    @Autowired
    private EmailSender emailSender;

    @RabbitListener(queues="fiap.scj.mensagens", containerFactory="jsaFactory")
    public void receivedMessages(InfoMensagem infoMensagem){
        System.out.println("Received message: "+infoMensagem);
        emailSender.sender(infoMensagem);
    }
}

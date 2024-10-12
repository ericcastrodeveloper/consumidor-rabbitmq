package br.com.fiap.consumidorrabbitmq;

import br.com.fiap.consumidorrabbitmq.model.InfoMensagem;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class EmailSender {

    @Autowired
    private JavaMailSender mailSender;

    public String sender(InfoMensagem infoMensagem){
        try {
            MimeMessage mail = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper( mail );
            helper.setTo(infoMensagem.getEmailNotificacao());
            helper.setSubject( "Notificação - Você acaba de receber um novo comentário na publicação" );
            helper.setText("<p><b>"+ infoMensagem.getAutorComentario()+ "</b>  respondeu sua publicação: "+infoMensagem.getComentario()+"</p>", true);
            mailSender.send(mail);

            return "OK";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar e-mail";
        }
    }
}

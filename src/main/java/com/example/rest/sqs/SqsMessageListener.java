package com.example.rest.sqs;


import io.awspring.cloud.sqs.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SqsMessageListener {

   // private static final Logger logger = LoggerFactory.getLogger(SqsMessageListener.class);

    @SqsListener("queue-java-test")
    public void receiveMessage(String message) {
        try {
                System.out.println("Mensagem recebida: " + message);
            }catch (Exception e){
                System.out.println("Mensagem recebida ERROR: " + e);
            }
    }
}


//@Slf4j
//@Service
//public class SqsMessageListener {

//    @SqsListener(value = "fila-test-sqs-java", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
//        public void QueueListener(String message, @Header("TransactionId") String transactionId) {
//            try {
//                System.out.println("Mensagem recebida: " + message);
//            }catch (Exception e){
//                System.out.println("Mensagem recebida ERROR: " + e);
//            }
//
//        }

//    @SqsListener("fila-test-sqs-java")
//        public void QueueListener(String message) {
//            try {
//                System.out.println("Mensagem recebida: " + message);
//            }catch (Exception e){
//                System.out.println("Mensagem recebida ERROR: " + e);
//            }
//
//        }
//
//}

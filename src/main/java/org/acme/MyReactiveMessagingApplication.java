package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyReactiveMessagingApplication {

  
    /**
     * Consume the message from the "orders" channel
     **/
    @Incoming("orders")
    public Uni<Void> processMessage(Message<String> message) {
        System.out.println(message.getPayload());
        return Uni.createFrom().nullItem();
    }
}

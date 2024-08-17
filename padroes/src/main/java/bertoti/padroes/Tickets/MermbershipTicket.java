package bertoti.padroes.Tickets;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MermbershipTicket implements Ticket{
    private LocalDate dateOfSubscription;
    private LocalDate dateOfEmission;
    private boolean expired;


    @Override
    public Double pay(Double amount) {
        return amount*0.7;
    }
}

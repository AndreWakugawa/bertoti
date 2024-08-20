package bertoti.padroes.strategy.Tickets;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DefaultTicket implements Ticket {
    private LocalDate dateOfEmission;

    @Override
    public Double pay(Double amount) {
        return amount;
    }
}

package bertoti.padroes.strategy.Tickets;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DiscountTicket implements Ticket {
    private boolean underAgeOrSenior;
    private LocalDate dateOfEmission;

    @Override
    public Double pay(Double amount) {
        return amount*0.5;
    }
}

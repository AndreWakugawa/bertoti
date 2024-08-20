package bertoti.padroes.strategy;

import bertoti.padroes.strategy.Tickets.Ticket;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Visitor {
    private String name;
    private LocalDate dob;
    private Ticket ticket;
    private boolean member;
}

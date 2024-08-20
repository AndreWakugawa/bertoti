package bertoti.padroes.strategy;

import bertoti.padroes.strategy.Tickets.DefaultTicket;
import bertoti.padroes.strategy.Tickets.DiscountTicket;
import bertoti.padroes.strategy.Tickets.MermbershipTicket;
import bertoti.padroes.strategy.Tickets.Ticket;
import bertoti.padroes.strategy.util.RandomDateGenerator;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Strategy {
    public static void main(String[] args) {
        Random rng = new Random();
        Double ticketValue = 10.0;
        Double totalAmount = 0.0;
        Double defaultAmount = 0.0;
        Double discountAmount = 0.0;
        Double membershipAmount = 0.0;

        List<Visitor> visitors = new ArrayList<>();

        int visitorsAmount = rng.nextInt(1000-10) + 10;

        for (int i = 0; i < visitorsAmount; i++) {
            Visitor visitor = null;
            LocalDate dob = RandomDateGenerator.between(LocalDate.of(1930, Month.JANUARY, 1), LocalDate.now());
            String name = UUID.randomUUID().toString().substring(0, 6);
            boolean member = rng.nextBoolean();
            Ticket ticket;

            if (LocalDate.now().getYear() - dob.getYear() < 12
                    || LocalDate.now().getYear() - dob.getYear() >= 65) {
                ticket = new DiscountTicket();
                visitor = Visitor.builder()
                        .name(name)
                        .dob(dob)
                        .member(member)
                        .ticket(ticket)
                        .build();
                Double paidAmount = visitor.getTicket().pay(ticketValue);
                totalAmount += paidAmount;
                discountAmount += paidAmount;
            }

            if (member) {
                ticket = new MermbershipTicket();
                visitor = Visitor.builder()
                        .name(name)
                        .dob(dob)
                        .member(member)
                        .ticket(ticket)
                        .build();
                Double paidAmount = visitor.getTicket().pay(ticketValue);
                totalAmount += paidAmount;
                membershipAmount += paidAmount;
            } else {
                ticket = new DefaultTicket();
                visitor = Visitor.builder()
                        .name(name)
                        .dob(dob)
                        .member(member)
                        .ticket(ticket)
                        .build();
                Double paidAmount = visitor.getTicket().pay(ticketValue);
                totalAmount += paidAmount;
                defaultAmount += paidAmount;
            }
            visitors.add(visitor);
        }

        System.out.println("Total income from " + visitorsAmount + " visitors: " + totalAmount);
        System.out.println("Income from default tickets: " + defaultAmount);
        System.out.println("Income from memberships: " + membershipAmount);
        System.out.println(("Income from kids and elderly: " + discountAmount));
    }
}
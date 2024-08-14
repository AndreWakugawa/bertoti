package bertoti.padroes;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Cliente {
    private String nome;
    private ComprarPao comprarPao;

    public void comprar() {
        comprarPao.comprar();
    }
}

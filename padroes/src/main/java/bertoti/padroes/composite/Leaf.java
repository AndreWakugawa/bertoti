package bertoti.padroes.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Leaf implements Component{
    private String name;

    @Override
    public void execute() {
        System.out.println("folha");
    }
}

package lightbishop.domain.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "of")
public class Player {
    private PersonalData personalData;
}

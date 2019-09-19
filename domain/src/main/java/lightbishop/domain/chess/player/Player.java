package lightbishop.domain.chess.player;

import lightbishop.domain.chess.common.PersonalData;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "of")
public class Player {
    private PersonalData personalData;
}

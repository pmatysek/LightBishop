package lightbishop.domain.chess.common;

import lightbishop.domain.chess.player.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "of")
public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private GameScore gameScore;
    private int boardNumber;
    private int roundNumber;
}

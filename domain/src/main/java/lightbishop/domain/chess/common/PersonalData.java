package lightbishop.domain.chess.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor(staticName = "of")
public class PersonalData {

    private String name;

    private String surname;

    private LocalDate birthDate;
}

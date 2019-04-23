package lightbishop.domain.chess;

import java.util.Comparator;

public interface SortingField<T> {
    Comparator<T> getComparingFunction();
}

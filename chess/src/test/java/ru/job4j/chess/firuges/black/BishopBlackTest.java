package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void positionTrue() {
        Figure bishopBlack = new BishopBlack(Cell.H3);
        Cell actual = bishopBlack.position();
        assertThat(actual, is(Cell.H3));
    }

    @Test
    public void copyTrue() {
        Figure bishopBlack = new BishopBlack(Cell.H3);
        Figure actual = bishopBlack.copy(Cell.F1);
        assertThat(actual.position(), is(Cell.F1));
    }

    @Test
    public void wayTrue() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(actual, is(expected));
    }
}

package ru.job4j.chess;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test(expected = IllegalStateException.class)
    public void moveIsNotPossible() {
        Logic logic = new Logic();
        Figure bishopBlack = new BishopBlack(Cell.F1);
        Figure pawnBlack = new PawnBlack(Cell.E2);
        logic.add(bishopBlack);
        logic.add(pawnBlack);
        logic.move(Cell.F1, Cell.C4);
        assertThat(bishopBlack.position(), is(Cell.F1));
    }

    @Test
    public void moveIsPossible() {
        Logic logic = new Logic();
        Figure bishopBlack = new BishopBlack(Cell.F1);
        Figure pawnBlack = new PawnBlack(Cell.E1);
        logic.add(bishopBlack);
        logic.add(pawnBlack);
        logic.move(Cell.F1, Cell.C4);
        assertThat(bishopBlack.position(), is(Cell.F1));
    }
}

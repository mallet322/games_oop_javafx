package ru.job4j.chess.firuges.black;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void whenPositionA1thenA1() {
        Cell expectedPosition = Cell.A1;
        BishopBlack bishopBlack = new BishopBlack(expectedPosition);
        Cell actualPosition = bishopBlack.position();
        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCopyA1thenA1() {
        Cell expectedPosition = Cell.A1;
        BishopBlack exp = new BishopBlack(expectedPosition);
        Figure act = exp.copy(expectedPosition);
        Assert.assertEquals(exp.position(), act.position());
    }

    @Test
    public void whenC1WayToG5() {
        Cell expectedPosition = Cell.C1;
        BishopBlack bishopBlack = new BishopBlack(expectedPosition);
        Cell[] actualArray = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertThat(bishopBlack.way(Cell.G5), Matchers.is(actualArray));
    }

    @Test
    public void whenF1WayToB5() {
        Cell expectedPosition = Cell.F1;
        BishopBlack bishopBlack = new BishopBlack(expectedPosition);
        Cell[] actualArray = new Cell[] {Cell.E2, Cell.D3, Cell.C4, Cell.B5};
        Assert.assertThat(bishopBlack.way(Cell.B5), Matchers.is(actualArray));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenD1WhenToA8ThenThrowsException() {
        Cell expectedPosition = Cell.D1;
        BishopBlack bishopBlack = new BishopBlack(expectedPosition);
        bishopBlack.way(Cell.H6);
    }

}
package ru.job4j.puzzle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class WinTest {
    @Test
    public void whenVerticalWin() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenHorizontalWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenNotWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
        };
        assertThat(Win.check(board), is(false));
    }

    @Test
    public void whenNotWinL() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
        };
        assertThat(Win.check(board), is(false));
    }

}
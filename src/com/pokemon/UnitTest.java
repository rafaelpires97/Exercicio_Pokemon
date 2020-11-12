package com.pokemon;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void teste1() {
        Game game = new Game();
        String input = "NNNNNNNNN";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste2() {
        Game game = new Game();
        String input = "SSSSSSSSS";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste3() {
        Game game = new Game();
        String input = "EEEEEEEEE";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste4() {
        Game game = new Game();
        String input = "OOOOOOOOO";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste5() {
        Game game = new Game();
        String input = "NNNNNNNNN";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste6() {
        Game game = new Game();
        String input = "SSSSSSSSS";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste7() {
        Game game = new Game();
        String input = "EEEEEEEEE";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }

    @Test
    void teste8() {
        Game game = new Game();
        String input = "OOOOOOOOO";
        HashSet<Coordenadas> visitedCoords = new HashSet<>();
        String[] separatedString= input.split("");
        assertEquals(10,game.playGame(separatedString, visitedCoords));
    }





}
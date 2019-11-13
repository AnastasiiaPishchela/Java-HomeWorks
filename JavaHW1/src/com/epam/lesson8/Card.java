package com.epam.lesson8;

/* Опишите перечисления Suit (SPADE, DIAMOND, CLUB, HEART) и Rank
(ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
QUEEN, KING). Затем добавьте класс Card (поля типа Suit и Rank;
конструктор и метод toString()).
Добавьте код создания колоды карт (массив размерностью 52 карты) и ее вывода. */

public class Card {
    public Rank rank;
    public Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card: " + this.getClass().getSimpleName() +
                ", rank: " + rank +
                ", suit: " + suit;
    }

    Card[] cards = {new Rank, new Suit};
}

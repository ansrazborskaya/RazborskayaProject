package com.stormnet.homework.homework3.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CardTest {
    public static void main(String[] args) throws ParseException {

        Card card = new Card("5535 6789 1123 4567", "DEBIT", "Sidorov", new SimpleDateFormat("dd/MM/yyyy").parse("19/05/2021"), 222);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("5535678911234567", "DEBIT", "Sidorov", new SimpleDateFormat("dd/MM/yyyy").parse("19/05/2021"), 222));
        cards.add(new Card("7775678881234567", "DEBIT", "Test3", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2021"), 553));
        cards.add(new Card("6575678881234999", "DEBIT", "Petrov", new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2022"), 623));
        cards.add(new Card("5555678881234567", "DEBIT", "Test1", new SimpleDateFormat("dd/MM/yyyy").parse("30/12/2020"), 923));
        cards.add(new Card("6575678881234921", "DEBIT", "Test2", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/2023"), 100));
        cards.add(new Card("6575678881234999", "DEBIT", "Petrov", new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2022"), 623));


        Card.CardValidator.validateCard(cards, card);
    }
}

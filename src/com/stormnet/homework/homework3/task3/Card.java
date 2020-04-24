package com.stormnet.homework.homework3.task3;

import java.util.ArrayList;
import java.util.Date;

public class Card {

    private String cardNumber;
    private String typeCard;
    private String owner;
    private Date cardExpiryDate;
    private int CVV;

    public Card(String cardNumber, String typeCard, String owner, Date cardExpiryDate, int CVV) {
        this.cardNumber = cardNumber;
        this.typeCard = typeCard;
        this.owner = owner;
        this.cardExpiryDate = cardExpiryDate;
        this.CVV = CVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(Date cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    Card.CardValidator cardValidator = new Card.CardValidator();

    static class CardValidator {
        public static void validateCard(ArrayList<Card> cards, Card inputCard) {

            Date date = new Date();

            boolean validInput = true;
            boolean cardFound = false;

            String cuttedString = inputCard.getCardNumber().replaceAll(" ","");

            if (cuttedString.length() < 16) {
                System.out.printf("Respected %s , card number %s must be equal to 16 numbers !!", inputCard.getOwner(), inputCard.getCardNumber());
                validInput = false;
            }
            if (inputCard.getTypeCard() != "DEBIT") {
                System.out.println("Invalid card type for card number: " + inputCard.getCardNumber());
                validInput = false;
            }

            if (inputCard.getOwner() == null) {
                System.out.println("Need to enter owner name for card number: " + inputCard.getCardNumber());
                validInput = false;
            }

            if (inputCard.getCardExpiryDate().before(date)) {
                System.out.println("Card expired!");
                validInput = false;
            }

            if (String.valueOf(inputCard.getCVV()).length() != 3) {
                System.out.println("CVV be equal to 3 numbers !!");
                validInput = false;
            }

            if (!validInput) {
                return;
            }

            for (Card card : cards) {

                if (card.getCardNumber().equals(cuttedString)) {

                    cardFound = true;

                    if (inputCard.getTypeCard() != card.getTypeCard()) {
                        System.out.println("Invalid card type for card number: " + inputCard.getCardNumber());
                        validInput = false;
                    }
                    if (inputCard.getOwner() != card.getOwner()) {
                        System.out.println("Invalid owner name for card number: " + inputCard.getCardNumber());
                        validInput = false;
                    }

                    if (String.valueOf(inputCard.getCVV()).length() != String.valueOf(card.getCVV()).length()) {
                        System.out.println("Invalid CVV");
                        validInput = false;
                    }
                }
            }

            if (cardFound == false) {
                System.out.println("No requested card found!");
                return;
            }

            if (validInput == true) {
                System.out.println("Card is Ok!");
            }
        }
    }
}

package org.example.Enum;

enum PaymentMethod {
    CASH,
    CREDIT_CARD,
    DEBIT_CARD;

    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isValid() {
        switch (this) {
            case CASH:
                return true;
            case CREDIT_CARD:
                return cardNumber != null && expirationDate != null && cvv != null;
            case DEBIT_CARD:
                return cardNumber != null && expirationDate != null && cvv != null;
            default:
                return false;
        }
    }
}
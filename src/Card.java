public class Card extends Student {
    private int cardId;
    private String beginDate;
    private String endDate;
    private int bookCode;

    public Card(String name, int studentId, String birthday, String classStudent, int cardId, String beginDate, String endDate, int bookCode) {
        super(name, studentId, birthday, classStudent);
        this.cardId = cardId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.bookCode = bookCode;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return super.toString() + ", Card{" +
                "cardId=" + cardId +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", bookCode=" + bookCode +
                '}';
    }
}

package Chapter10.Homework;

public class Essay extends GradedActivity {

    private int grammar, spelling, length, content;

    public Essay(int grammar, int spelling, int length, int content) {

        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    public Essay() {
    }
    public void calculateTotalScore(){
        super.setScore(getGrammar()+getContent()+getLength()+getSpelling());
    }

    public int getGrammar() {
        return grammar;
    }

    public void setGrammar(int grammar) {
        this.grammar = grammar;
    }

    public int getSpelling() {
        return spelling;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

}

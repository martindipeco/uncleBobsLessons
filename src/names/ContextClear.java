package names;

public class ContextClear {
    //please refer to names.ContextUnclear to see original method

    //first correction: split function into smaller pieces

    //make 3 variables fields of this class (attributes)
    private String number;
    private String verb;
    private String pluralModifier;

    public String getMessage(char candidate, int count) {
        createPluralMessageDependentMessageParts(count);
        return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
    }

    private void createPluralMessageDependentMessageParts(int count) {
        if(count == 0) {
            thereAreNoLetters();
        } else if (count == 1) {
            thereIsOneLetter();
        }
        else {
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(int count) {
        number = String.valueOf(count);
        verb = "are";
        pluralModifier = "s";
    }

    private void thereIsOneLetter() {
        number = "1";
        verb = "is";
        pluralModifier = "";
    }

    private void thereAreNoLetters() {
        number = "no";
        verb = "are";
        pluralModifier = "s";
    }
}

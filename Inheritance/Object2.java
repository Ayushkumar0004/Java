class ClassA {
    private String text;

    public ClassA(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ClassA other = (ClassA) obj;
        return text.equals(other.text);
    }
}

class ClassB {
    private String text;

    public ClassB(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class Object2 {
    public static void main(String[] args) {
        ClassA objA = new ClassA("Hello");
        ClassB objB = new ClassB("Hello");

        System.out.println(objA.equals(objB) ? "Strings from different classes are equal." : "Strings from different classes are not equal.");
    }
}
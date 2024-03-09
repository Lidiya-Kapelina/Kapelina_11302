class Student {
    private String name;
    private String surname;
    private int score;

    public Student(String name, String surname, int score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public String getname() {
        return name;
    }

    public String getsurname() {
        return surname;
    }

    public int getscore() {
        return score;
    }
}
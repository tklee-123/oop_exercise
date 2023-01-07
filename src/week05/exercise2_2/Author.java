package week05.exercise2_2;

public class Author {
    private String name;
    private String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Author")
                .append("[")
                .append("name = ")
                .append(this.name)
                .append(", ")
                .append("email = ")
                .append(this.email)
                .append(", ")
                .append("gender = ")
                .append(this.gender)
                .append("]");
        return description.toString();
    }
}

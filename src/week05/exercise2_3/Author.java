package week05.exercise2_3;

public class Author {
    private String name, email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                .append("]");
        return description.toString();
    }
}

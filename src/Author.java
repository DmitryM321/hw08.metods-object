import java.util.Objects;
public class Author {
    private String firstname;
    private String laststname;

    public Author(String firstname, String laststname) {
        this.firstname = firstname;
        this.laststname = laststname;
    }
    public String getAuthorFirdstName() {
        return firstname;
    }
    public String getAuthorLastSurname(){
        return laststname;
    }
    @Override
    public String toString() {
        return firstname + " " + laststname;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        return Objects.equals(firstname, author.laststname) && Objects.equals(firstname, author.laststname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstname, laststname);
    }
}


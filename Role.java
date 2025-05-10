public class Role {
    private String type;
    public static final String STUDENT = "Student";
    public static final String FACULTY = "Faculty";

    public Role(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

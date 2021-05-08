public class Course {

    private String courseName;
    private String description;
    private String teacherName;
    private int price;

    public Course( String courseName, String description, String teacherName) {

        this.courseName = courseName;
        this.description = description;
        this.teacherName = teacherName;

    }



    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getTeacherName() {

        return teacherName;
    }

    public void setTeacherName(String teacherName) {

        this.teacherName = teacherName;
    }






}

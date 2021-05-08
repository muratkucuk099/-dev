public class CourseManager {

    public void add(Course course) {

        System.out.println(course.getCourseName() + " Kursu eklendi");
        System.out.println(course.getDescription());
        System.out.println(course.getTeacherName());

    }
    public void percent(Course course) {

        System.out.println("İlerlemeniz kaydedildi");
    }
}

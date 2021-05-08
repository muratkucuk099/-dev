public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java geliştirici yazılım kampı",
                "2 ay sürecek java kursumuzda çok şey öğreneceksiniz",
                "Engin Demiroğ");

        Course course2 = new Course("C# geliştirici yazılım kampı",
                "2 ay sürecek java kursumuzda çok şey öğreneceksiniz",
                "Engin Demiroğ");

        Course course3 = new Course("Programlamaya Giriş kampı",
                "2 ay sürecek java kursumuzda çok şey öğreneceksiniz",
                "Engin Demiroğ" );



        Course[] courses = new Course[] {course1,course2,course3};
        for (Course course: courses) {
            System.out.println(course.getCourseName());
            
        }
        System.out.println("");
        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        courseManager.percent(course1);
        System.out.println("");
        courseManager.add(course2);
        courseManager.percent(course2);
        System.out.println("");
        courseManager.add(course3);
        courseManager.percent(course3);


    }
}

package studentarray.example.demo;

public class Course {
    private String courseNumber;
    private String courseName;
    private  String roomNumber;
    private  String semester;
    private  String year;

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber='" + courseNumber + '\'' +
                ", courseName='" + courseName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

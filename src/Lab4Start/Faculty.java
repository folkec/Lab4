package Lab4Start;

/**
 * Created by evanfolk on 9/27/17.
 */
public class Faculty extends Employee {

    private String[] courses;
    private static int DEFAULTNUMBEROFCOURSES = 4;

    public Faculty()
    {
        super();
        courses = new String[DEFAULTNUMBEROFCOURSES];
    }

    public Faculty(String inName, double inSalary, String[] inCourses)
    {
        super();
        setName(inName);
        setSalary(inSalary);
        setCourses(inCourses);
    }
    public String getName() { return "Professor" + super.getName();}
    public String[] getCourses()

    {
        String[] temp = new String[courses.length];
        for (int i=0; i < courses.length; i++)
            temp[i] = courses[i];
        return temp;
    }

    public void setCourses (String[] inCourses)
    {
        courses = new String[inCourses.length];
        for(int i=0; i < courses.length; i++)
            courses[i] = inCourses[i];

    }
    public String toSTring() {return getName()+ "earns" +getSalary();}
}

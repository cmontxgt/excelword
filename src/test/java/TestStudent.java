import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/20.
 */
public class TestStudent {
    private Date birthDay;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {

        return "Student{" +
                "birthDay=" +  new SimpleDateFormat("yyyy-MM-dd").format(birthDay) +
                '}';
    }
}

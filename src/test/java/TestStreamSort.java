import org.joda.time.DateTime;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/3/20.
 */
public class TestStreamSort {

   
    @org.junit.Test
    public  void  test(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date = DateTime.now().toDate();
        TestStudent testStudent = new TestStudent();
        testStudent.setBirthDay(date);


        String s="2016/8/15";
        String s2="2014/8/15";
        String s3="2015/8/15";

        TestStudent TestStudent1 = new TestStudent();


        TestStudent1.setBirthDay(date);

        TestStudent TestStudent2 = new TestStudent();

        TestStudent2.setBirthDay(new Date(s2));



        List <TestStudent> test=new ArrayList<>();
        testStudent .setAge(23);
         TestStudent1.setAge(21);
        TestStudent2.setAge(24);
        test.add(testStudent);
        test.add(TestStudent1);
        test.add(TestStudent2);

        List<TestStudent> collect =

        test.stream().sorted(Comparator.comparing(TestStudent::getBirthDay).reversed()).collect(Collectors.toList());
        for (TestStudent TestStudent3 : collect) {
            System.out.println(TestStudent3);
        }





    }

    @Test
    public  void  testCountDownLatch() throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
                 countDownLatch.countDown();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2");
                countDownLatch.countDown();
            }
        }).start();
        countDownLatch.await();
        countDownLatch.await(30, TimeUnit.SECONDS);
        System.out.println("主线程");
    }

@Test
    public void  tes1t(){
    HashMap<Object, Object> t = new HashMap<>();
    t.put("2123",2);
    t.put("12322",2);
    t.put("23",2);
    t.put("2124",2);
    t.put("21235",2);
    t.put("21236",2);
    t.put("27",2);
    t.put("21238",2);
    t.put("2129",2);
    t.put("20",2);
    t.put("21-",2);
    t.put("2qw",2);
    t.put("2qweqwe",2);
    t.put("2qweqw",2);
    t.put("2qwe",2);



}


}

package s04_class_object.bai_tap;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public StopWatch(){
        this.startTime= new Date();
    }
    public void start(){
        this.startTime= new Date();
    }
    public void stop(){
        this.endTime=new Date();
    }
    public float getElapsedTime(){
        return this.getEndTime().getTime()-this.getStartTime().getTime();
        /*sử dụng getTime() để lấy ra giá trị giây mới thực hiện phép toán được,
          còn để kiểu getStart và getEnd là kiểu Date nên không thực hiện phép trừ được*/
    }

    public static void main(String[] args) {
        StopWatch demo1= new StopWatch();

        //thuc hien thuat toan:

        double[] arr1 = new double[50000];
        for(int i= 0; i<50000; i++){
            arr1[i] = Math.random()*100 + 1;
        }
        System.out.println(Arrays.toString(arr1));

        demo1.stop();
        System.out.printf("Elapsed time: %.2f ms", demo1.getElapsedTime());


    }
}

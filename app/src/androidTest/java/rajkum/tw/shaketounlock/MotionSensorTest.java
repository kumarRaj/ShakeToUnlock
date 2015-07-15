package rajkum.tw.shaketounlock;


import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;


/**
 * Created by rajkum on 15/07/15.
 */
public class MotionSensorTest extends ActivityUnitTestCase<MotionSensor> {
    public MotionSensorTest(Class<MotionSensor> activityClass) {
        super(activityClass);
    }

    public MotionSensorTest(){
        super(null);

    }
    public void shouldFailTest(){

        Intent motionSensor = new Intent(getInstrumentation().getTargetContext(), MotionSensor.class);
        startActivity(motionSensor,null,null);
        assertEquals(true, false);
    }

}

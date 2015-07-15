package rajkum.tw.shaketounlock;

import android.content.Intent;
import android.os.IBinder;
import android.test.ServiceTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by rajkum on 15/07/15.
 */
public class MainServiceTest extends ServiceTestCase<MainService> {
    /**
     * Constructor
     *
     * @param serviceClass The type of the service under test.
     */
    public MainServiceTest(Class<MainService> serviceClass) {
        super(serviceClass);
    }

    public MainServiceTest (){
        super(MainService.class);
    }
    @SmallTest
    public void testPreconditions() {
    }

    /**
     * Test basic startup/shutdown of Service
     */
    @SmallTest
    public void testStartable() {
        Intent startIntent = new Intent();
        startIntent.setClass(getContext(), MainService.class);
        startService(startIntent);
    }

    @MediumTest
    public void testBindable() {
        Intent startIntent = new Intent();
        startIntent.setClass(getContext(), MainService.class);
        IBinder service = bindService(startIntent);
    }
}

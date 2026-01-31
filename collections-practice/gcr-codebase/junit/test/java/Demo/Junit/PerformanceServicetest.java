package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceServicetest {
	void testLongRunningTask() throws InterruptedException {

        PerformanceService service = new PerformanceService();
        String result = service.longRunningTask();

        assertEquals("Task Completed", result);
    }
}

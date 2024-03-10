package page.ym2ha0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        logger.info("Run batch job with args: " + Arrays.deepToString(args));

        logger.info("Initializing application context");
        ApplicationContext app = new ClassPathXmlApplicationContext("conf/beans.xml");

        BatchJob job = app.getBean("batchJob", BatchJob.class);
        job.run();
    }
}
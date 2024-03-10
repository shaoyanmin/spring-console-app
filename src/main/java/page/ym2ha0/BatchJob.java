package page.ym2ha0;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BatchJob {
    private static final Logger logger = LogManager.getLogger(BatchJob.class);

    public void run() {
        logger.info("Run batch job!");
    }

    @Override
    public String toString() {
        return "BatchJob instance";
    }
}

package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by nike on 1.12.16.
 */
@Profiling
public class TerminatorQuoter implements Quoter {

    public TerminatorQuoter() {
    }

    @PostConstruct
    public void init() {
        System.out.println(repeat);
    }

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    public void setMessage(String message) {
            this.message = message;
    }
}

package quoters;

/**
 * Created by nike on 1.12.16.
 */
public class ProfilingController implements ProfilingControllerMBean{
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

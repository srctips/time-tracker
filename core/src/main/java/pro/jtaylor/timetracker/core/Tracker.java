package pro.jtaylor.timetracker.core;

import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
public class Tracker {
    private List<TimeEntry> entries = null;

    public void add(TimeEntry entry) {

    }

    public void remove(TimeEntry entry) {

    }
}

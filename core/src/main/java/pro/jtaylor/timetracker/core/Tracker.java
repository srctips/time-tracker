package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
     * Add method
     * @param TimeEntry to add to entries
     */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Remove method
     * @param TimeEntry to remove from entries
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * Size method
     * @param int size for entries
     */
    public int size() {
        return entries.size();
    }

    /**
     * Get method
     * @param int index for entries
     */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}


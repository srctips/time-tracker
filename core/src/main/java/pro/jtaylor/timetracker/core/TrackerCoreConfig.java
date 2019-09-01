package pro.jtaylor.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("pro.jtaylor.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}

package m2m.repo;

import java.time.LocalDateTime;

import m2m.repo.entities.SensorStatistics;

public interface SensorsStatisticsRepo
{
	SensorStatistics getSensorStatistics(int sensorId, LocalDateTime from, 
			LocalDateTime to);
}

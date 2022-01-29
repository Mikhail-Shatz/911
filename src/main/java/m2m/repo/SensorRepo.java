package m2m.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import m2m.repo.entities.SensorDoc;

public interface SensorRepo extends MongoRepository<SensorDoc, Object>, SensorsStatisticsRepo 
{
	
}

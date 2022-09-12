package com.example.demo.Repository;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.TwitterEntity;

@Repository
public interface TwitterRepository extends JpaRepository<TwitterEntity, Integer> {

	@Query(value="select * from twitter_entity where created_at=\"2022-05-16 15:21:52\" limit 5",nativeQuery = true)
	List<TwitterEntity> hashTagsGet(@Param("createdAt") Timestamp createdAt);

	@Query(value="Select * from twitter_entity order by created_at desc limit 5;",nativeQuery = true) 
	List<TwitterEntity> getTwitterHashTage();
	
	
}

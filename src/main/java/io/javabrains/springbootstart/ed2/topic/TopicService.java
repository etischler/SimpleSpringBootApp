package io.javabrains.springbootstart.ed2.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by etischler on 7/24/2017.
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript","JavaScript", "JavaScript Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        for(int i = 0; i < topics.size();i++){
            if(topics.get(i).getId().equals(id))
                return topics.get(i);
        }
        return null;
    }
}

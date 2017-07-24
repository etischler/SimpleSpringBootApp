package io.javabrains.springbootstart.ed2.topic;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by etischler on 7/24/2017.
 */
@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics",method = RequestMethod.GET)
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }
    @RequestMapping(value = "/topics/{id}",method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){ //@PathVariable("name") if like not same above
        return topicService.getTopic(id);
    }
}

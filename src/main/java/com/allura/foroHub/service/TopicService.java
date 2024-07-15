package com.allura.foroHub.service;

import com.allura.foroHub.domain.Topic;
import com.allura.foroHub.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private ITopicRepository topicRepository;

    public Topic createTopic(Topic topic, UserDetails user) {
        topic.setUserEmail(user.getUsername());
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }

    public Topic updateTopic(Long id, Topic topic) {
        Topic existingTopic = topicRepository.findById(id).orElseThrow(() -> new RuntimeException("Topic no encontrado"));
        existingTopic.setTitle(topic.getTitle());
        existingTopic.setMessage(topic.getMessage());
        existingTopic.setCourseName(topic.getCourseName());
        return topicRepository.save(existingTopic);
    }
}
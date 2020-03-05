package com.pluhin.repostbot.service;

import com.pluhin.repostbot.entity.QueueEntity;
import java.util.List;

public class NotifyQueueCreateService implements QueueCreateService {

  private final NotificationService notificationService;
  private final QueueCreateService delegate;

  public NotifyQueueCreateService(NotificationService notificationService,
      QueueCreateService delegate) {
    this.notificationService = notificationService;
    this.delegate = delegate;
  }

  @Override
  public List<QueueEntity> create(String queueId, List<Integer> hours) {
    List<QueueEntity> entities = delegate.create(queueId, hours);
    notificationService.notifyQueueCreated(queueId);
    return entities;
  }
}

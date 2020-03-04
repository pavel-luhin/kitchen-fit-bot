package com.pluhin.repostbot.service;

import com.pluhin.repostbot.model.PostsSourceDTO;
import com.pluhin.repostbot.model.domainid.SourceDomainId;

public interface GetSourceInfoService {

  PostsSourceDTO getSource(SourceDomainId domainId);
}
